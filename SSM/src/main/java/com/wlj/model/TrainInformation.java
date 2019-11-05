package com.wlj.model;


import java.sql.Time;
import java.util.Date;

public class TrainInformation {

    private  Integer id;
    private  String trainsId;           //车次
    private  String firstTrainsId;        //首乘车次
    private  String secondTrainsId;       //换乘车次
    private  String siteId;             //站台ID
    private  String leftTime;         //出发时间
    private  String standName;        //站名
    private  String arrivalTime;     //出发时间
    private  String drivingTime;    //到达时间
    private  String startName;     // 起始站
    private  Integer hou;          //小时
    private  Integer mi;              //分钟
    private  Integer midHou;    //中间换乘小时
    private  Integer midMi;          //中间换乘分钟
    private  Time  midArrivalTime;   //换乘站到达时间
    private  Time  midDrivingTime;     //换乘站出发时间
    private  String endName;         //终点站
    private  String midName;         //换乘站
    private  String mileage;          //里程
    private  Float firstClassFare;     //一等座
    private  Float secondClassFare;    //二等座
    private  Float hardSeatFare;       //硬座
    private  Float  standFare;         //站票

    private  Float hardSleeperFare;    //硬卧

    public Integer getMidHou() {
        return midHou;
    }

    public void setMidHou(Integer midHou) {
        this.midHou = midHou;
    }

    public Integer getMidMi() {
        return midMi;
    }

    public void setMidMi(Integer midMi) {
        this.midMi = midMi;
    }

    public Time getMidArrivalTime() {
        return midArrivalTime;
    }

    public void setMidArrivalTime(Time midArrivalTime) {
        this.midArrivalTime = midArrivalTime;
    }

    public Time getMidDrivingTime() {
        return midDrivingTime;
    }

    public void setMidDrivingTime(Time midDrivingTime) {
        this.midDrivingTime = midDrivingTime;
    }



    public Integer getHou() {
        return hou;
    }

    public void setHou(Integer hou) {
        this.hou = hou;
    }

    public Integer getMi() {
        return mi;
    }

    public void setMi(Integer mi) {
        this.mi = mi;
    }

    public Float getFirstClassFare() {
        return firstClassFare;
    }

    public void setFirstClassFare(Float firstClassFare) {
        this.firstClassFare = firstClassFare;
    }

    public Float getSecondClassFare() {
        return secondClassFare;
    }

    public void setSecondClassFare(Float secondClassFare) {
        this.secondClassFare = secondClassFare;
    }

    public Float getHardSeatFare() {
        return hardSeatFare;
    }

    public void setHardSeatFare(Float hardSeatFare) {
        this.hardSeatFare = hardSeatFare;
    }

    public Float getStandFare() {
        return standFare;
    }

    public void setStandFare(Float standFare) {
        this.standFare = standFare;
    }

    public Float getHardSleeperFare() {
        return hardSleeperFare;
    }

    public void setHardSleeperFare(Float hardSleeperFare) {
        this.hardSleeperFare = hardSleeperFare;
    }




    public Float firstClassFare() {
        return firstClassFare;
    }

    public void firstClassFare(Float firstClassFare) {
        this.firstClassFare = firstClassFare;
    }
    public String getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(String leftTime) {
        this.leftTime = leftTime;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "TrainInformation{" +
                "id=" + id +
                ", trainsId='" + trainsId + '\'' +
                ", firstTrainsId='" + firstTrainsId + '\'' +
                ", secondTrainsId='" + secondTrainsId + '\'' +
                ", siteId='" + siteId + '\'' +
                ", leftTime='" + leftTime + '\'' +
                ", standName='" + standName + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", drivingTime='" + drivingTime + '\'' +
                ", startName='" + startName + '\'' +
                ", hou=" + hou +
                ", mi=" + mi +
                ", midHou=" + midHou +
                ", midMi=" + midMi +
                ", midArrivalTime=" + midArrivalTime +
                ", midDrivingTime=" + midDrivingTime +
                ", endName='" + endName + '\'' +
                ", midName='" + midName + '\'' +
                ", mileage='" + mileage + '\'' +
                ", firstClassFare=" + firstClassFare +
                ", secondClassFare=" + secondClassFare +
                ", hardSeatFare=" + hardSeatFare +
                ", standFare=" + standFare +
                ", hardSleeperFare=" + hardSleeperFare +
                '}';
    }

    public String getFirstTrainsId() {
        return firstTrainsId;
    }

    public void setFirstTrainsId(String firstTrainsId) {
        this.firstTrainsId = firstTrainsId;
    }

    public String getSecondTrainsId() {
        return secondTrainsId;
    }

    public void setSecondTrainsId(String secondTrainsId) {
        this.secondTrainsId = secondTrainsId;
    }

    public String getStartName() {
        return startName;
    }

    public void setStartName(String startName) {
        this.startName = startName;
    }

    public String getEndName() {
        return endName;
    }

    public void setEndName(String endName) {
        this.endName = endName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrainsId() {
        return trainsId;
    }

    public void setTrainsId(String trainsId) {
        this.trainsId = trainsId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getStandName() {
        return standName;
    }

    public void setStandName(String standName) {
        this.standName = standName;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDrivingTime() {
        return drivingTime;
    }

    public void setDrivingTime(String drivingTime) {
        this.drivingTime = drivingTime;
    }

}
