package com.sympleco.common.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.widgets.layout.HStack;
import com.smartgwt.client.widgets.layout.VStack;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.toolbar.ToolStrip;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.ImgButton;
import com.smartgwt.client.widgets.toolbar.ToolStripButton;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.toolbar.ToolStripSeparator;
import com.smartgwt.client.widgets.toolbar.ToolStripMenuButton;
import com.smartgwt.client.widgets.toolbar.ToolStripSpacer;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tile.TileLayout;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.HTMLPane;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.InlineHTML;
import com.smartgwt.client.widgets.HTMLFlow;
import com.smartgwt.client.widgets.toolbar.ToolStripResizer;
import com.smartgwt.client.widgets.RichTextEditor;
import com.smartgwt.client.widgets.form.SearchForm;
import com.smartgwt.client.types.FormMethod;
import com.smartgwt.client.widgets.form.fields.TextAreaItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.google.gwt.user.client.ui.Image;
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
