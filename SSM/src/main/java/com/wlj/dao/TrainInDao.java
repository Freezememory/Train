package com.wlj.dao;

import com.wlj.model.TrainInformation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TrainInDao {

    List queryByName(String standName);

    List queryByTwoName(@Param("startName") String startName,@Param("endName") String endName);

    List queryByTwoNameTransfer(@Param("startName") String startName,@Param("endName") String endName);

    List queryByTrainsId(String trainsId);

    List queryByTrainsIdForImformation (String trainsId);

    TrainInformation queryById(Integer id);

    void  deleteTrainInformation(Integer id);

    void updateTrainInformation(TrainInformation trainInformation);

    void  insertTrainInformation(TrainInformation trainInformation);


}
