/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : recuperate

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 08/07/2020 23:05:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hotel_egress
-- ----------------------------
DROP TABLE IF EXISTS `hotel_egress`;
CREATE TABLE `hotel_egress`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CUSTOMER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `OUTGOING_REASON` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `OUTGOING_TIME` datetime(0) NULL DEFAULT NULL,
  `EXPECTEDRETURN_TIME` datetime(0) NULL DEFAULT NULL,
  `ACTUALRETURN_TIME` datetime(0) NULL DEFAULT NULL,
  `ESCORTED` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `RELATION` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ESCORTEDTEL` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `AUDIT_STATUS` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hotel_egress
-- ----------------------------
INSERT INTO `hotel_egress` VALUES (1, '杨鑫', '事假', '2020-07-05 00:00:00', '2020-07-06 00:00:00', '2020-07-21 01:35:58', '杨三', '父子', '18616823222', '0');
INSERT INTO `hotel_egress` VALUES (7, '曹君', '病假', '2020-07-08 00:00:00', '2020-07-01 00:00:00', '2020-07-01 00:00:00', '王力飞', '父子', '13103539999', '1');
INSERT INTO `hotel_egress` VALUES (9, '柳云', '其他', '2020-07-08 18:34:23', '2020-06-04 18:34:41', '2020-07-10 00:00:00', '王坤鹏', '叔侄', '13103539820', '0');
INSERT INTO `hotel_egress` VALUES (10, '商妍', '搬家', '2020-07-10 18:34:25', '2020-06-04 18:34:41', '2020-06-04 18:34:41', '汤骏', '朋友', '13103539826 ', '0');
INSERT INTO `hotel_egress` VALUES (11, '王天', '病假', '2020-06-04 18:34:41', '2020-07-10 00:00:00', '2020-07-10 00:00:00', '孙秀苇', '夫妻', '13103539873', '0');
INSERT INTO `hotel_egress` VALUES (12, '武安', '搬家', '2020-06-04 18:34:41', '2020-06-04 18:34:41', '2020-06-04 18:34:41', '王永伟', '叔侄', '13103539916 ', '2');
INSERT INTO `hotel_egress` VALUES (13, '刘晓燕', '病假', '2020-06-04 18:34:41', '2020-07-10 00:00:00', '2020-06-04 18:34:41', '尚志强', '叔侄', '13103539756 ', '0');
INSERT INTO `hotel_egress` VALUES (14, '刘家明', '病假', '2020-06-04 18:34:41', '2020-07-10 00:00:00', '2020-07-10 00:00:00', '王石磊', '兄弟', '13103539746 ', '2');
INSERT INTO `hotel_egress` VALUES (15, '庞博', '溜达', '2020-06-04 18:34:41', '2020-07-10 00:00:00', '2020-06-04 18:34:41', '王余', '叔侄', '13103539809 ', '0');
INSERT INTO `hotel_egress` VALUES (16, '邵露', '病假', '2020-06-04 18:34:41', '2020-06-04 18:34:41', '2020-07-10 00:00:00', '谭畅', '闺蜜', '13103539871 ', '2');

SET FOREIGN_KEY_CHECKS = 1;
