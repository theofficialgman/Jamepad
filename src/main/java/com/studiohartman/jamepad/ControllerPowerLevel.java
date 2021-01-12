package com.studiohartman.jamepad;

/**
 * This is an enumerated type for power level of controllers.
 * <p>
 * Derived from enum SDL_JoystickPowerLevel in SDL_joystick.h.
 * <p>
 * We start with an index -1, so different from most other enums, we need a helper method to
 * convert the SDL-returned int to the enum
 *
 * @author Benjamin Schulte
 */
public enum ControllerPowerLevel {
    /**
     * Power level unknown
     */
    SDL_JOYSTICK_POWER_UNKNOWN,
    /**
     * Power level 0-5%
     */
    SDL_JOYSTICK_POWER_EMPTY,   /* <= 5% */
    /**
     * Power level 6-20%
     */
    SDL_JOYSTICK_POWER_LOW,     /* <= 20% */
    /**
     * Power level 21-70%
     */
    SDL_JOYSTICK_POWER_MEDIUM,  /* <= 70% */
    /**
     * Power level 71-100%
     */
    SDL_JOYSTICK_POWER_FULL,    /* <= 100% */
    /**
     * Controller is wired
     */
    SDL_JOYSTICK_POWER_WIRED,
    SDL_JOYSTICK_POWER_MAX;

    public static ControllerPowerLevel valueOf(int n) {
        return ControllerPowerLevel.values()[n + 1];
    }

}
