package com.vml.algorithm

import org.scalatest._
import com.vml.algorithm._
import com.vml.algorithm.mouthSensitivities._
import com.vml.algorithm.treatments.{ImitationOfTongueMovement, SensoryPreparation}
import com.vml.algorithm.tongueFunctioning.CantImitateOrTongueOut

class PrepStepSpec extends WordSpec with Matchers {

  "Prep Step" should {

    // TODO test with pronunciation > 75% and
    "select sensory preparation treatment for mouth sensitivity" in {
      PrepStep(MajorSubSensitivity, CantImitateOrTongueOut).treatments should contain (SensoryPreparation)
      PrepStep(MajorOverSensitivity, CantImitateOrTongueOut).treatments should contain (SensoryPreparation)
      PrepStep(MinorSubSensitivity, CantImitateOrTongueOut).treatments should contain (SensoryPreparation)
      PrepStep(MinorOverSensitivity, CantImitateOrTongueOut).treatments should contain (SensoryPreparation)
      PrepStep(Normal, CantImitateOrTongueOut).treatments should not contain SensoryPreparation
    }

    "select tongue function treatment plans" in {
      PrepStep(Normal, CantImitateOrTongueOut).treatments should contain (ImitationOfTongueMovement)
    }
  }
}
