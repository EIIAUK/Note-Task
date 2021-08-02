/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50644
Source Host           : localhost:3306
Source Database       : recuperate

Target Server Type    : MYSQL
Target Server Version : 50644
File Encoding         : 65001

Date: 2020-07-09 11:00:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `bed_manage`
-- ----------------------------
DROP TABLE IF EXISTS `bed_manage`;
CREATE TABLE `bed_manage` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `CREATE_DATE` date NOT NULL,
  `ROOM_NUMBER` varchar(10) NOT NULL,
  `BED_STATUS` varchar(10) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of bed_manage
-- ----------------------------
INSERT INTO `bed_manage` VALUES ('2', '2020-07-02', '102', '1', '夏');
INSERT INTO `bed_manage` VALUES ('3', '2020-07-03', '201', '0', '秋');
INSERT INTO `bed_manage` VALUES ('4', '2020-07-04', '202', '0', '东');
INSERT INTO `bed_manage` VALUES ('5', '2020-06-30', '1', '0', '1');
