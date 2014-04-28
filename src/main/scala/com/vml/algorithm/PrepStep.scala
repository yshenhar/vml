package com.vml.algorithm

import com.vml.algorithm.mouthSensitivities.{Normal, MouthSensitivity}
import com.vml.algorithm.treatments.{ImitationOfTongueMovement, SensoryPreparation}
import com.vml.algorithm.tongueFunctioning.{CantImitateOrTongueOut, TongueFunctioning}

case class PrepStep(mouthSensitivity: MouthSensitivity, tongueFunctioning: TongueFunctioning) {
  // TODO deal with remarks for treatments
  def treatments = {
    def mouth = mouthSensitivity match {
      case Normal => Nil
      case _ => Seq(SensoryPreparation)
    }
    def tongue = tongueFunctioning match {
      case CantImitateOrTongueOut => Seq(ImitationOfTongueMovement)
    }

    mouth ++ tongue
  }

}
