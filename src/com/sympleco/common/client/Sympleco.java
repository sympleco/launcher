package com.sympleco.common.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.toolbar.ToolStripResizer;
import com.google.gwt.user.client.ui.Grid;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Sympleco implements EntryPoint {
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		main m = new main();
		Canvas cv = m.mainPanel();
//		rootPanel.add(cv, 5, 5);
		
		Grid grid = new Grid(1, 2);
		rootPanel.add(grid);
		
//		InlineHTML nlnhtmlSympleSolutions = new InlineHTML("Symple Solutions");
		grid.setWidget(0, 0, new ToolStripResizer());
		grid.setWidget(0, 1, cv);
	}
}
