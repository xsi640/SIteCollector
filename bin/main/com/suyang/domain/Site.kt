package com.suyang.domain

import java.util.*
import javax.persistence.*

/**
 * 站点
 */
@Entity
@Table
class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    @Column(nullable = false)
    lateinit var name: String
    @Column(nullable = false)
    lateinit var url: String
    @Column(nullable = false)
    lateinit var createTime: Date
    @Column(nullable = false)
    lateinit var updateTime: Date
}