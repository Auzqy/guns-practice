--  au added for test gus-generator model, used managementUI
/*
 Navicat Premium Data Transfer

 Source Server         : au_mac_pro_local
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : 127.0.0.1:3306
 Source Schema         : guns

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 10/02/2020 22:03:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for au_tbl_house
-- ----------------------------
DROP TABLE IF EXISTS `au_tbl_house`;
CREATE TABLE `au_tbl_house` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `house_user` varchar(32) DEFAULT NULL,
  `house_address` varchar(50) DEFAULT NULL,
  `house_time` datetime DEFAULT NULL,
  `house_desc` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='房屋管理表';

-- ----------------------------
-- Records of au_tbl_house
-- ----------------------------
BEGIN;
INSERT INTO `au_tbl_house` VALUES (1, '张三丰Test', '五台山悬空寺', '2017-12-28 00:00:00', '五台山悬空寺');
INSERT INTO `au_tbl_house` VALUES (2, '狄仁杰Test', '狄仁杰', '2017-12-04 00:00:00', '狄仁杰');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
