package com.soda3x;

import com.google.inject.Provides;
import javax.inject.Inject;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(name = "System Clock")
public class SystemClockPlugin extends Plugin {

	@Inject
	private OverlayManager m_overlayManager;

	@Inject
	private SystemTimeOverlay m_systemTimeOverlay;

	@Override
	protected void startUp() throws Exception {
		m_overlayManager.add(m_systemTimeOverlay);
	}

	@Override
	protected void shutDown() throws Exception {
		m_overlayManager.remove(m_systemTimeOverlay);
	}

	@Provides
	SystemClockConfig provideConfig(ConfigManager configManager) {
		return configManager.getConfig(SystemClockConfig.class);
	}
}
