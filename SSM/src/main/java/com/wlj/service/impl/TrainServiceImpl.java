package com.wlj.service.impl;


import com.wlj.dao.TrainInDao;

import com.wlj.model.TrainInformation;
import com.wlj.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "trainService")//@Service("trainService")
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainInDao  trainInDao;

    public List getTrainIm(String standName){

        return trainInDao.queryByName(standName);
    }
    @Override
    public List getByTwoName(String startName,String endName){


        return  trainInDao.queryByTwoName(startName, endName);

    }

    @Override
    public  List getByTwoNameTransfer(String startName , String endName){

        return  trainInDao.queryByTwoNameTransfer(startName , endName);
    }
    @Override
    public  List getByTrainsId(String trainsId){

        return  trainInDao.queryByTrainsId(trainsId);
    }

    @Override
    public  List getByTrainsIdImformation(String triansId){
        return  trainInDao.queryByTrainsIdForImformation(triansId);
    }


    @Override
    public  TrainInformation getById(Integer id){

        return  trainInDao.queryById(id);
    }

    public  void  deleteTrainIn(Integer id){

        trainInDao.deleteTrainInformation(id);
    }
    @Override
    public  void  updateTrainIn(TrainInformation trainInformation){
        trainInDao.updateTrainInformation(trainInformation);
    }
    @Override
    public  void  insertTrainIn(TrainInformation trainInformation){
        trainInDao.insertTrainInformation(trainInformation);
    }
}
