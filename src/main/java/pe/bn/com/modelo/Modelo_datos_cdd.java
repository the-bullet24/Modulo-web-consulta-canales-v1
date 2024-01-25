package pe.bn.com.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "bnmssftf01_client_soft"   ,  schema = "bn_ms_soft") 
public class Modelo_datos_cdd implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "f01_id_client")
    private int f01_id_client;

    @Column(name = "f01_type_doc", length = 20)
    private String f01_type_doc;

    @Column(name = "f01_num_doc", length = 12)
    private String f01_num_doc;

    @Column(name = "f01_name_client", length = 150)
    private String f01_name_client;

    @Column(name = "f01_oper_mobile", length = 20)
    private String f01_oper_mobile;

    @Column(name = "f01_number_mobile", length = 9)
    private String f01_number_mobile;

    @Column(name = "f01_channel_code", length = 12)
    private String f01_channel_code;

    @Column(name = "f01_affil_date")
    private Timestamp f01_affil_date;

    @Column(name = "f01_affil_channel", length = 12)
    private String f01_affil_channel;

    @Column(name = "f01_affil_application", length = 12)
    private String f01_affil_application;

    @Column(name = "f01_affil_status", length = 2)
    private String f01_affil_status;

    @Column(name = "f01_token_status", length = 2)
    private String f01_token_status;

    @Column(name = "f01_flag_terms", length = 1)
    private char f01_flag_terms;

    @Column(name = "f01_flag_affil", length = 1)
    private Character f01_flag_affil;

    @Column(name = "f01_security_status", length = 4)
    private String f01_security_status;

    @Column(name = "f01_security_status_date")
    private Timestamp f01_security_status_date;

    @Column(name = "f01_cia_code", length = 500)
    private String f01_cia_code;

    @Column(name = "f01_model_mobile", length = 50)
    private String f01_model_mobile;

    @Column(name = "f01_token_notification", length = 500)
    private String f01_token_notification;

    @Column(name = "f01_mobile_store", length = 50)
    private String f01_mobile_store;


  
}