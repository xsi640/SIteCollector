package com.suyang.domain

import java.util.*
import javax.persistence.*

/**
 * 文档，抓取完成后输出的结果数据
 */
@Entity
@Table(indexes = arrayOf(
        Index(name = "document_collectId", columnList = "collectId")
))
class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    @Column(nullable = false)
    lateinit var title: String
    @Column(nullable = false)
    lateinit var createTime: Date
    @Column(nullable = false)
    lateinit var updateTime: Date
    @Lob
    lateinit var metadatas: String
    @Lob
    lateinit var attachments: String
    @Column(nullable = false)
    var collectId: Long = 0
}