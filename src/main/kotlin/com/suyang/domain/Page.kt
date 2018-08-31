package com.suyang.domain

import java.util.*
import javax.persistence.*

/**
 * 抓取下来的详情页面（用于分析）
 */
@Entity
@Table(indexes = arrayOf(
        Index(name = "resource_url_index", columnList = "url", unique = true)
))
class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    @Column(nullable = false)
    lateinit var url: String
    @Lob
    @Column(nullable = false)
    lateinit var content: String
    @Column(nullable = false)
    lateinit var createTime: Date
    @Column(nullable = false)
    lateinit var updateTime: Date
    @Column(nullable = false)
    var siteId: Int = 0
    @Column(nullable = false)
    var collectId: Int = 0
}