package com.wlj.crawler;

import com.wlj.model.TrainInformation;
import com.wlj.service.TrainService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;


public class TrainCrawler {

        public  static  String trainId ;
        public  static  String url ;
        public static  String siteId ;
        public static  String standName;
        public static  String arrivalTime;
        public static  String drivingTime;
        public static  String leftTime;
        public static  String mileage;

        //需要与配置文件完成映射
       static   ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-mybatis.xml"});
       private  static  TrainService trainService  =  (TrainService)context.getBean("trainService");
        // private static Logger log = LoggerFactory.getLogger(TrainCrawler.class);
        public static void main(String[] args) {
            Trains();
        }


        /**
         *获取火车车次ID
         */
        @RequestMapping("insertTrainInformation")
        public static void Trains(){
            TrainInformation trainInformation  = new TrainInformation();
            //String trainNo;
            try {
                Document document = Jsoup.connect("https://vip.huoche.net/train/search?k1=%E5%8D%97%E6%98%8C&k2=%E5%B9%BF%E5%B7%9E&goDate=2019-05-15").get();
                Elements ee = document.select(".train-list");
                //System.out.println(ee.select(".train-data").text());
                for(Element e:ee){
                    Elements iml = e.select(".train-data");
                    for(Element im11:iml){
                        Elements im2 =im11.select(".w1 strong");
                        trainId = im2.text();
                        // System.out.println(trainNo);
                        url =  "http://qq.ip138.com/train/"+trainId+".htm";
                        Document document1 = Jsoup.connect(url).get();
                        Elements doc = document1.select("#stationInfo tr").next();
                        for(Element  doc1:doc){
                         //  System.out.println(trainId);
                            trainInformation.setTrainsId(trainId);
                            Elements im5 = doc1.select("td");
                            for(int i = 1 ; i< im5.size() ; i++){
                            switch (i){
                                case 1 : siteId = im5.eq(0).text();
                                    trainInformation.setSiteId(siteId); break;
                                case 2: standName = im5.eq(1).text();
                                    trainInformation.setStandName(standName);break;
                                case 3: arrivalTime = im5.eq(2).text();
                                    trainInformation.setArrivalTime(arrivalTime);break;
                                case 4:drivingTime = im5.eq(3).text();
                                    trainInformation.setDrivingTime(drivingTime);break;
                                case 5:leftTime = im5.eq(4).text();
                                     trainInformation.setLeftTime(leftTime);break;
                                case 6:mileage = im5.eq(5).text();
                                    trainInformation.setMileage(mileage);break;
                                     }
                            }
                            trainService.insertTrainIn(trainInformation);
                        }
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }


