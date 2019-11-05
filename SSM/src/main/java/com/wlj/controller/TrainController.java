package com.wlj.controller;


import com.wlj.model.TrainInformation;
import com.wlj.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
@RequestMapping("/query")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @RequestMapping("/train")
    public String  train(){
        return "/WEB-INF/train.jsp";
    }

   //通过站点搜索
    @RequestMapping("/gettrainim")
    public String  stand(@RequestParam("name")String standName ,Model model) {
        try {
            TrainInformation train = new TrainInformation();
            train.setStandName(standName);
            List trainim = trainService.getTrainIm(standName);
            model.addAttribute("trainim",trainim);
            return "trainsInfor";
        } catch (Exception e) {
            e.printStackTrace();
        }
       return null;
    }


// 通过起始站和终点站查询
    @RequestMapping("/gettrainsid")
    public String trainId(@RequestParam("startName") String startName,@RequestParam ("endName") String endName,Model model){
        try{
            TrainInformation train = new TrainInformation();
            train.setStandName(startName);
            train.setStandName(endName);
        List  trainsid = trainService.getByTwoName(startName,endName);
        model.addAttribute("trainsid",trainsid);
        //换乘参数传输
        List trainsTranser = trainService.getByTwoNameTransfer(startName,endName);
        model.addAttribute("trainsTranser",trainsTranser);
        return  "trainsInfor";
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }

    //通过车次信息查询该车次所有信息
     @RequestMapping("/gettrainsinformation")
    public String  triansId(@RequestParam("trainsId") String trainsId,Model model){
        try{
            TrainInformation train = new TrainInformation();
            train.setTrainsId(trainsId);
            List  information = trainService.getByTrainsId(trainsId);
           model.addAttribute("information",information);
           return  "trainInformation";
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }

    //通过车次信息查询此车次始终站信息
    @RequestMapping("/gettrains")
    public String  gettrains(@RequestParam("trainsId") String trainsId,Model model){
        try{
            TrainInformation train = new TrainInformation();
            train.setTrainsId(trainsId);
            List  information = trainService.getByTrainsIdImformation(trainsId);
            model.addAttribute("information",information);
            return  "trainsInfor";
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }


      //删除车次信息里的某一条信息
    @RequestMapping("/deletetraininformation")
    public  String deletetraininformation(Integer id,Model model){
        trainService.deleteTrainIn(id);
        model.addAttribute("msg","删除成功");
        return "train";
    }

   //通过ID查询
    @RequestMapping("/querybyid")
    public String  queryById(@RequestParam("id") Integer id,Model model){
        try{
            TrainInformation trains   = trainService.getById(id);
            model.addAttribute("trains",trains);
            return  "update";
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }

    //更新车次信息的某一条信息
    @RequestMapping("/updatetraininformation")
    public  String updateTrainInformation(TrainInformation trainInformation){
        trainService.updateTrainIn(trainInformation);
        return "train";
    }

    //插入车次数据
    @RequestMapping("/inserttraininformation")
    public String inserttraininformation(@RequestParam("trainsId")String trainsId,@RequestParam("siteId")String siteId,
                                         @RequestParam("standName")String standName,@RequestParam("arrivalTime")String arrivalTime,
                                         @RequestParam("drivingTime")String drivingTime ,@RequestParam("leftTime")String leftTime,
                                         @RequestParam("mileage")String mileage, Model model){
        TrainInformation trainInfor = new TrainInformation();
        trainInfor.setTrainsId(trainsId);
        trainInfor.setSiteId(siteId);
        trainInfor.setStandName(standName);
        trainInfor.setArrivalTime(arrivalTime);
        trainInfor.setDrivingTime(drivingTime);
        trainInfor.setLeftTime(leftTime);
        trainInfor.setMileage(mileage);
        trainService.insertTrainIn(trainInfor);
        return "train";
    }

    @RequestMapping("/skip")
    public String skip(){
        return "update";
    }

    @RequestMapping("/skip2")
    public  String skip2(){
        return  "trainInformation";
    }



}
