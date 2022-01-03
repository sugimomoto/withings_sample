package sugimomoto;

public enum MeasType {
    Weight(1),
    Height(4),
    FatFreeMass(5),
    FatRatio(6),
    FatMassWeight(8),
    DiastolicBloodPressure(9),
    SystolicBloodPressure (10),
    HeartPulse(11),
    Temperature(12),
    SP02(54),
    BodyTemperature(71),
    SkinTemperature(73),
    MuscleMass(76),
    Hydration(77),
    BoneMass(88),
    PulseWaveVelocity(91),
    VO2MaxIsAnumericalMeasurementOfYourBodysAbilityToConsumeOxygen(123),
    QRSIntervalDurationBasedOnECGSignal(135),
    PRIntervalDurationBasedOnECGSignal(136),
    QTIntervalDurationBasedOnECGSignal(137),
    CorrectedQTIntervalDurationBasedOnECGSignal(138),
    AtrialFibrillationResultFromPPG(139);

    private final Integer value;

    private MeasType(Integer value){
        this.value = value;
    }

    public Integer getValue(){
        return value;
    }
}
