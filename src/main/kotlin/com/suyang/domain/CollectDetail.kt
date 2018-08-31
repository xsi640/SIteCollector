package com.suyang.domain

import java.util.*
import javax.persistence.*

/**
 * 收藏的项目详情
 */
@Entity
@Table(indexes = arrayOf(
        Index(name="collectdetail_collectid_index", columnList = "collectId"),
        Index(name="collectdetail_chilrencollectid_index", columnList = "chilrenCollectId")
))
class CollectDetail {
    /**
     * url列表表达式，同下面的startExpr,endExpr配合使用
     */
    @Column(nullable = true)
    lateinit var urlExpr: String
    /**
     * start表达式，表达列表的开始数字
     */
    @Column(nullable = true)
    lateinit var startExpr: String
    /**
     * end表达式，表达列表的结束数字
     */
    @Column(nullable = true)
    lateinit var endExpr: String
    @Column(nullable = false)
    var collectId: Long = 0
    @Column(nullable = false)
    var chilrenCollectId: Long = 0
    /**
     * 抓取方式（策略）
     */
    @Lob
    @Column(nullable = true)
    lateinit var metadatas: String

    @Column(nullable = false)
    lateinit var createTime: Date
    @Column(nullable = false)
    lateinit var updateTime: Date
}