package com.studiohartman.jamepad;

/**
 * This is an enumerated type for power level of controllers.
 * <p>
 * Derived from enum SDL_JoystickPowerLevel in SDL_joystick.h.
 *
 * @author Benjamin Schulte
 */
public enum ControllerPowerLevel {
    /**
     * Power level unknown
     */
    POWER_UNKNOWN,
    /**
     * Power level 0-5%
     */
    POWER_EMPTY,   /* <= 5% */
    /**
     * Power level 6-20%
     */
    POWER_LOW,     /* <= 20% */
    /**
     * Power level 21-70%
     */
    POWER_MEDIUM,  /* <= 70% */
    /**
     * Power level 71-100%
     */
    POWER_FULL,    /* <= 100% */
    /**
     * Controller is wired
     */
    POWER_WIRED,
    POWER_MAX;

    public static ControllerPowerLevel valueOf(int n) {
        // C enum starts with -1, so we need to increment by one
        return ControllerPowerLevel.values()[n + 1];
    }

}
