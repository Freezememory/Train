package com.wlj.utils;



import java.util.*;


public class ListRemove {

    public  static  void  main(String [] args){
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        for(int i = 0;i<10;i++){
            list1.add("Test"+i);
        }
        for(int j = 5;j<20;j++){
            list2.add("Test"+j);
        }
      //  getSame(list1,list2);
        removeSame(list1,getSame(list1,list2));
    }

    public  static  List<String>getSame(List<String> list1,List<String> list2){
        List<String>  same = new ArrayList<String>();
        long  start = System.currentTimeMillis();
                    Map<String,Integer> map= new HashMap<String,Integer>(list1.size()+list2.size());
                    List<String> maxList = list1;
                    List<String> minList = list2;
                    if(list2.size()>list1.size()){
                        maxList = list2;
                        minList = list1;
                    }
                    for (String string: maxList){
                        map.put(string,1);
                    }
                    for (String string : minList){
                        Integer count = map.get(string);
                        if(count != null){
                            map.put(string,++count);
                            continue;
                        }
                        else {
                            map.put(string,1);
                        }
                    }
                    for (Map.Entry<String,Integer> entry :map.entrySet()){
                        if(entry.getValue() >1 ){
                            same.add(entry.getKey());
                        }
                    }
                    System.out.println("耗时： "+ (System.currentTimeMillis() - start) + " 毫秒");

                    /* Iterator iterator = same.iterator();
                       while (iterator.hasNext()){
                          System.out.println(iterator.next());
                   }*/
                   /* for (int i = 0;i<same.size();i++){
                        System.out.println(same.get(i));
                    }*/
                     return same;
    }

    public static List<String> removeSame(List<String> list3,List<String> list4){
                     for(String string : list4){
                         list3.remove(string);
                     }
                    for (int i = 0;i<list3.size();i++){
                         System.out.println(list3.get(i));
                     }
                     return  list3;

    }

}
