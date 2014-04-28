package com.vml

package object algorithm {

  object treatments {
    sealed trait Treatment
    case object SensoryPreparation extends Treatment
    case object ImitationOfTongueMovement extends Treatment
    case object OralImitation extends Treatment
    case object PreparationExhalationAndExhalationWithAid extends Treatment
    case object ExhaleWithoutRegulationAndWithoutAid extends Treatment
    case object RegulatedBlowing extends Treatment
    case object Blowing extends Treatment
  }

  object complementaryTreatment {
    sealed trait ComplementaryTreatment
    case object TreatmentOfFeelingInTheMouth extends ComplementaryTreatment
  }

  object mouthSensitivities {
    sealed trait MouthSensitivity
    case object MajorSubSensitivity extends MouthSensitivity
    case object MajorOverSensitivity extends MouthSensitivity
    case object MinorSubSensitivity extends MouthSensitivity
    case object MinorOverSensitivity extends MouthSensitivity
    case object Normal extends MouthSensitivity
  }

  object tongueFunctioning {
    sealed trait TongueFunctioning
    case object CantImitateOrTongueOut extends TongueFunctioning
    case object TongueOutImitation extends TongueFunctioning
    case object TongueOutAndSidesImitation extends TongueFunctioning
    case object TongueOutSidesAndUpImitation extends TongueFunctioning
    case object FreeTongueMovement extends TongueFunctioning
  }

  object oralImitation {
    sealed trait OralImitation
    case object NoOralImitation extends OralImitation
    case object ConsistentMouthImitationWithAccessories extends OralImitation
    case object AtLeast3MouthImitationsNoAccessories extends OralImitation
    case object Over8MouthImitationsNoAccessories extends OralImitation
  }

  object breathingControl {
    sealed trait BreathingControl
    case object NoBreathingControl extends BreathingControl
    case object BlowWhistleOrFlute extends BreathingControl
    case object BlowSoapBubbles extends BreathingControl
    case object BlowingImitationAccordingToAge extends BreathingControl
  }
}
