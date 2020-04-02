package com.github.kfcfans.oms.server.persistence.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 应用信息表
 *
 * @author tjq
 * @since 2020/3/30
 */
@Data
@Entity
@Table(name = "app_info")
public class AppInfoDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String appName;
    private String description;

    private Date gmtCreate;
    private Date gmtModified;
}