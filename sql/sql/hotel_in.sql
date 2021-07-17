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

 Date: 08/07/2020 23:05:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hotel_in
-- ----------------------------
DROP TABLE IF EXISTS `hotel_in`;
CREATE TABLE `hotel_in`  (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `CREATE_DATE` date NULL DEFAULT NULL,
  `CUSTOMER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CUSTOMER_AGE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CUSTOMER_SEX` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `IDCARD` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ROOMID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `BUILDING_ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ELDER_TYPE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CHECKIN_DATE` date NULL DEFAULT NULL,
  `EXPIRATION_DATE` date NULL DEFAULT NULL,
  `CONTACTTEL` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `BED_ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PSYCHOSOMATICSTATE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ATTENTION` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `STATUS` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hotel_in
-- ----------------------------
INSERT INTO `hotel_in` VALUES (1, '2020-07-09', '李一', '85', '男', '370406197204278975', '5', '3', '月卡', '2020-07-08', '2020-07-30', '2', '1', '老年痴呆', '注意24小时陪护', '1');
INSERT INTO `hotel_in` VALUES (2, '2020-07-11', '张倩', '88', '女', '130629197912202796', '3', '2', '季卡', '2020-07-04', '2020-07-19', '1', '2', '残疾', '吃饭不方便，需要喂食', '0');
INSERT INTO `hotel_in` VALUES (5, '2020-07-08', '孙向红', '67', '女', '130421198906071630', '3', '3', '年卡', '2020-11-11', '2020-06-10', '2', '3', '冠心病', '少油', '0');
INSERT INTO `hotel_in` VALUES (7, '2020-07-08', '王明', '57', '女', '411402198811214837', '6', '6', '年卡', '6671-08-05', '2020-06-09', '1', '6', '脱发', '不能熬夜', '0');
INSERT INTO `hotel_in` VALUES (8, '2020-07-06', '孙力', '103', '0', '350402198201251393', '13', '12', '季卡', '2020-07-16', '2020-06-16', '1', '4', '高血糖', '少糖', '1');
INSERT INTO `hotel_in` VALUES (9, '2020-06-29', '周宗格', '57', '男', '350402198906037952', '7', '10', '季卡', '2020-07-13', '2020-07-09', '2', '2', '肥胖', '多运动', '0');

SET FOREIGN_KEY_CHECKS = 1;
