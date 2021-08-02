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

 Date: 08/07/2020 23:05:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for nurse_record
-- ----------------------------
DROP TABLE IF EXISTS `nurse_record`;
CREATE TABLE `nurse_record`  (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `CUSTOMERNAME` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NURSINGNAME` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `TIME` date NULL DEFAULT NULL,
  `COUNT` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `STAFFNAME` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2210 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nurse_record
-- ----------------------------
INSERT INTO `nurse_record` VALUES (2201, '吴平安', '房间清扫', '2020-07-01', '1', '王伟');
INSERT INTO `nurse_record` VALUES (2202, '张倩', '洗澡协助', '2020-07-06', '1', '耿云');
INSERT INTO `nurse_record` VALUES (2203, '王明', '洗澡协助', '2020-07-05', '1', '杨一凡');
INSERT INTO `nurse_record` VALUES (2205, '孙力', '个人卫生', '2020-07-01', '1', '徐晶晶');

SET FOREIGN_KEY_CHECKS = 1;
