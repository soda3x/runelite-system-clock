package com.soda3x;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.ui.overlay.OverlayPosition;

@ConfigGroup("systemclock")
public interface SystemClockConfig extends Config
{
	@ConfigItem(
		keyName = "format",
		name = "Time Format",
		description = "Choose how the time should be displayed"
	)
	default TimeFormat format() {
		return TimeFormat.CLOCK_24H_SS;
	}

	@ConfigItem(
		keyName = "overlayPosition",
		name = "Position",
		description = "The screen position of the clock overlay.",
		position = 2
    )
    default OverlayPosition overlayPosition() {
			return OverlayPosition.TOP_RIGHT;
    }

	@ConfigItem(
		keyName = "showTitle",
		name = "Show Title",
		description = "Toggle the display of the 'System Time' title.",
		position = 3
    )
    default boolean showTitle() {
			return true;
    }
}
