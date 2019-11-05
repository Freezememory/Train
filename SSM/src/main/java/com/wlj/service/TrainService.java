package com.wlj.service;

import com.wlj.model.TrainInformation;

import java.util.List;


public interface TrainService {

  List getTrainIm(String standName);

  List getByTwoName(String startName, String endName);

  List getByTwoNameTransfer(String startName, String endName);

  List getByTrainsId(String trainsId);

  List getByTrainsIdImformation(String triansId);

  TrainInformation  getById(Integer id);

  void  deleteTrainIn(Integer id);

  void  updateTrainIn(TrainInformation trainInformation);

  void  insertTrainIn(TrainInformation trainInformation);

}
