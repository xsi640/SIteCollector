package com.suyang.domain

import java.util.*
import javax.persistence.*

/**
 * 收藏的项目
 * （要抓取的项）
 */
@Entity
@Table(indexes = arrayOf(
        Index(name = "collect_siteid_index", columnList = "siteId"),
        Index(name = "collect_parentid_index", columnList = "parentId")
))
class Collect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    @Column(nullable = false)
    var siteId: Int = 0
    @Column(nullable = false)
    lateinit var name: String
    @Column(nullable = false)
    var parentId: Long = 0
    /**
     * 是否是收藏的页面
     * true-抓取后分析的页面提取metadata，
     * false-抓取后，分析list
     */
    @Column(nullable = false)
    var allowCollect: Boolean = false

    @Column(nullable = false)
    lateinit var createTime: Date
    @Column(nullable = false)
    lateinit var updateTime: Date
}