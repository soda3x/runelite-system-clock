package com.soda3x;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.inject.Inject;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class SystemTimeOverlay extends OverlayPanel {

  private final SystemClockConfig m_config;

  @Inject
  private SystemTimeOverlay(SystemClockConfig config) {
    m_config = config;
    setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
  }

  @Override
  public Dimension render(Graphics2D graphics) {

    TimeFormat selectedFormat = m_config.format();
    String pattern = selectedFormat.getFormatString();
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(pattern);

    String currentTimeAndDay = LocalDateTime.now().format(timeFormatter);

    if (m_config.showTitle()) {
      panelComponent.getChildren().add(TitleComponent.builder()
          .text("System Time")
          .build());
    }

    panelComponent.getChildren().add(TitleComponent.builder()
        .text(currentTimeAndDay)
        .build());

    return super.render(graphics);
  }
}