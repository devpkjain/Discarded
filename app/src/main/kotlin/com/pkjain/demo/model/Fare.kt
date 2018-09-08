package com.pkjain.demo.model

/**
 *This class defines fare info
 */
data class FareInfo(val Adult: Fares, val Child: Fares, val Senior: Fares)

data class Fares(val fares: List<Fare>)

data class Fare(val description: String, val price: Float)