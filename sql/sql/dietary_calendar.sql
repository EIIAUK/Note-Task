/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50644
Source Host           : localhost:3306
Source Database       : recuperate

Target Server Type    : MYSQL
Target Server Version : 50644
File Encoding         : 65001

Date: 2020-07-09 11:00:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dietary_calendar`
-- ----------------------------
DROP TABLE IF EXISTS `dietary_calendar`;
CREATE TABLE `dietary_calendar` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `CREATE_DATE` date NOT NULL,
  `FOOD_NAME` varchar(10) NOT NULL,
  `FOOD_TYPE` varchar(10) NOT NULL,
  `FOOD_TAG` varchar(4) NOT NULL,
  `FOOD_PRICE` varchar(10) NOT NULL,
  `FOOD_PICTURE` varchar(30) DEFAULT NULL,
  `MAMAL_FLAG` varchar(4) NOT NULL,
  `SUPPLY_DATE` varchar(10) NOT NULL,
  `SUPPLY_TYPE` varchar(10) NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of dietary_calendar
-- ----------------------------
INSERT INTO `dietary_calendar` VALUES ('1', '2020-06-29', '红烧肉', '1', '3', '30', 'bouilli.jpg', '0', '10', '2');
INSERT INTO `dietary_calendar` VALUES ('2', '2020-06-29', '青椒土豆丝', '3', '6', '10', 'pepperpotato.jpg', '1', '11', '3');
INSERT INTO `dietary_calendar` VALUES ('3', '2020-06-30', '芝士蛋糕', '5', '1', '20', 'cheers.jpg', '1', '15', '7');
INSERT INTO `dietary_calendar` VALUES ('4', '2020-07-01', '番茄炒蛋', '2', '4', '10', 'tomatwithegg.jpg', '1', '23', '3');
