package com.suyang.domain

import javax.persistence.*

/**
 * 抓取下来的附件
 */
@Entity
@Table
class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0L
    @Column(nullable = false)
    lateinit var fileName: String
    @Lob
    @Column(nullable = false)
    lateinit var data: ByteArray
}