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

 Date: 08/07/2020 23:05:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hotel_out
-- ----------------------------
DROP TABLE IF EXISTS `hotel_out`;
CREATE TABLE `hotel_out`  (
  `ID` int(255) NOT NULL AUTO_INCREMENT,
  `CUSTOMER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `RETREAT_TIME` datetime(0) NULL DEFAULT NULL,
  `RETREAT_REASON` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `STATUS` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ASK_TIME` datetime(0) NULL DEFAULT NULL,
  `AUDITOPINION` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `AUDITPERSON` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hotel_out
-- ----------------------------
INSERT INTO `hotel_out` VALUES (5, '王海德', '2020-01-11 08:00:00', '去世', '1', '2020-01-11 08:00:00', NULL, '方宁宁\r\n');
INSERT INTO `hotel_out` VALUES (6, '丁玉成', '2020-07-02 00:00:00', '就医', '1', '2020-07-02 00:00:00', NULL, '李莹璐');
INSERT INTO `hotel_out` VALUES (7, '刘恩娜', '2020-07-02 00:00:00', '家中有事', '1', '2020-07-01 00:00:00', NULL, '王慧琳');
INSERT INTO `hotel_out` VALUES (9, '郝一霏', '2020-07-02 00:00:00', '回家养老', '0', '2020-07-02 00:00:00', NULL, '项灵芝');
INSERT INTO `hotel_out` VALUES (10, '袁小鹰', '2019-06-12 18:19:35', '就医', '0', '2020-07-08 18:20:13', NULL, '李泉福');
INSERT INTO `hotel_out` VALUES (11, '赵祎韬', '2020-01-15 18:19:42', '回家养老', '0', '2020-07-08 18:20:16', NULL, '陈子安');
INSERT INTO `hotel_out` VALUES (12, '陈培榆', '2009-06-16 18:19:47', '就医', '0', '2020-07-08 18:20:20', NULL, '王红星');
INSERT INTO `hotel_out` VALUES (13, '王大铁', '2020-07-05 00:00:00', '外出就医', '0', '2020-07-22 01:36:42', '', '李莹璐');

SET FOREIGN_KEY_CHECKS = 1;
