package com.healthcare.claims.model

import jakarta.persistence.*
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field


@Document("Claim")
data class Claim(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
                 val id:String,
                 @Field("claimAmount")
                 val claimAmount:Double,
                 @Field("claimType")
                 val claimType:String,
                 @Field("issueDescription")
                 val issueDescription:String
)
