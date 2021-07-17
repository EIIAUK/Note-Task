/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50644
Source Host           : localhost:3306
Source Database       : recuperate

Target Server Type    : MYSQL
Target Server Version : 50644
File Encoding         : 65001

Date: 2020-07-09 11:00:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `food_manage`
-- ----------------------------
DROP TABLE IF EXISTS `food_manage`;
CREATE TABLE `food_manage` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CREATE_DATE` date NOT NULL,
  `CUSTOM_NAME` varchar(11) NOT NULL,
  `FOOD_NAME` varchar(11) NOT NULL,
  `FOOD_DATE` varchar(10) DEFAULT NULL,
  `FOOD_WEEK` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of food_manage
-- ----------------------------
INSERT INTO `food_manage` VALUES ('1', '2020-07-02', '张散', '红烧肉', '5', '5');
INSERT INTO `food_manage` VALUES ('2', '2020-07-02', '李司', '骨头汤', '15', '3');
INSERT INTO `food_manage` VALUES ('3', '2020-07-03', '王武', '番茄炒蛋', '25', '5');
INSERT INTO `food_manage` VALUES ('4', '2020-07-04', '赵柳', '芝士蛋糕', '7', '7');
INSERT INTO `food_manage` VALUES ('6', '2020-07-02', '拾元', '大排', '3', '3');
INSERT INTO `food_manage` VALUES ('7', '2020-06-30', '一二', '与', '4', '5');
