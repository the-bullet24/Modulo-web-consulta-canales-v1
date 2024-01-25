CREATE TABLE `bnmssftf01_client_soft` (
  `f01_id_client` int NOT NULL AUTO_INCREMENT,
  `f01_affil_application` varchar(12) DEFAULT NULL,
  `f01_affil_channel` varchar(12) DEFAULT NULL,
  `f01_affil_date` datetime(6) DEFAULT NULL,
  `f01_affil_status` varchar(2) DEFAULT NULL,
  `f01_channel_code` varchar(12) DEFAULT NULL,
  `f01_cia_code` varchar(500) DEFAULT NULL,
  `f01_flag_affil` char(1) DEFAULT NULL,
  `f01_flag_terms` char(1) DEFAULT NULL,
  `f01_mobile_store` varchar(50) DEFAULT NULL,
  `f01_model_mobile` varchar(50) DEFAULT NULL,
  `f01_name_client` varchar(150) DEFAULT NULL,
  `f01_num_doc` varchar(12) DEFAULT NULL,
  `f01_number_mobile` varchar(9) DEFAULT NULL,
  `f01_oper_mobile` varchar(20) DEFAULT NULL,
  `f01_security_status` varchar(4) DEFAULT NULL,
  `f01_security_status_date` datetime(6) DEFAULT NULL,
  `f01_token_notification` varchar(500) DEFAULT NULL,
  `f01_token_status` varchar(2) DEFAULT NULL,
  `f01_type_doc` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`f01_id_client`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
SELECT * FROM cursojava.usuarios;