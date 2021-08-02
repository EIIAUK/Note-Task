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

 Date: 08/07/2020 23:05:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for nurse_info
-- ----------------------------
DROP TABLE IF EXISTS `nurse_info`;
CREATE TABLE `nurse_info`  (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `PRICE` decimal(10, 2) NULL DEFAULT NULL,
  `DESCIBE` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `FLAG` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `STATUS` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `LEVEL` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1114 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nurse_info
-- ----------------------------
INSERT INTO `nurse_info` VALUES (1101, '房间清扫', 10.00, '为老人打扫房间卫生', '是', '关闭', '三级');
INSERT INTO `nurse_info` VALUES (1102, '衣物清洗', 10.00, '为老人清洗衣物', '否', '开启', '三级');
INSERT INTO `nurse_info` VALUES (1103, '床品清洗', 10.00, '为老人清洗床单、晒被褥', '是', '关闭', '三级');
INSERT INTO `nurse_info` VALUES (1104, '洗澡协助', 10.00, '协助半自理老人洗澡', '否', '关闭', '二级');
INSERT INTO `nurse_info` VALUES (1105, '个人卫生', 10.00, '帮助半自理老人刮胡须剪指甲', '是', '开启', '二级');
INSERT INTO `nurse_info` VALUES (1106, '洗澡帮助', 15.00, '帮助非自理老人洗澡洗头', '是', '关闭', '一级');
INSERT INTO `nurse_info` VALUES (1107, '进食帮助', 10.00, '帮助非自理老人进食', '否', '开启', '一级');
INSERT INTO `nurse_info` VALUES (1108, '活动协助', 10.00, '帮助非自理的老人适当活动四肢', '是', '关闭', '一级');

SET FOREIGN_KEY_CHECKS = 1;
