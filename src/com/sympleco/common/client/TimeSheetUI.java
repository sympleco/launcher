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

public class TimeSheetUI {
	/**
	 * @wbp.parser.entryPoint
	 */
	Canvas mainPanel() {
		HLayout hLayout = new HLayout();

		VLayout layout = new VLayout();
		layout.setAutoHeight();
		layout.setSize("601px", "417px");
		HLayout hLayout_2 = new HLayout();
		hLayout_2.setSize("882px", "16px");
		
		HTMLFlow flwtheSympleCompany = new HTMLFlow("<bold>The Symple Company </bold>");
		hLayout_2.addMember(flwtheSympleCompany);
		layout.addMember(hLayout_2);

		ToolStrip toolStrip = new ToolStrip();
		toolStrip.setSize("882px", "24px");

		ToolStripButton toolStripButton_about = new ToolStripButton("About");
//		toolStripButton_about.setWidth("");
		toolStrip.addButton(toolStripButton_about);

		ToolStripSeparator toolStripSeparator = new ToolStripSeparator();
		toolStrip.addMember(toolStripSeparator);

		ToolStripButton toolStripButton_product = new ToolStripButton("Product");
//		toolStripButton_product.setWidth("");
		toolStrip.addButton(toolStripButton_product);

		ToolStripSeparator toolStripSeparator_1 = new ToolStripSeparator();
		toolStrip.addMember(toolStripSeparator_1);

		ToolStripButton toolStripButton_partner = new ToolStripButton("Partner");
		toolStrip.addButton(toolStripButton_partner);

		ToolStripSeparator toolStripSeparator_3 = new ToolStripSeparator();
		toolStrip.addMember(toolStripSeparator_3);

		ToolStripButton toolStripButton_pricing = new ToolStripButton("Pricing");
		toolStrip.addButton(toolStripButton_pricing);

		ToolStripSeparator toolStripSeparator_4 = new ToolStripSeparator();
		toolStrip.addMember(toolStripSeparator_4);

		ToolStripButton toolStripButton_signup = new ToolStripButton("Sign Up");
		toolStrip.addButton(toolStripButton_signup);

		ToolStripSeparator toolStripSeparator_2 = new ToolStripSeparator();
		toolStrip.addMember(toolStripSeparator_2);

		ToolStripButton toolStripButton = new ToolStripButton("Sign In");
		toolStrip.addButton(toolStripButton);

		ToolStripSeparator toolStripSeparator_5 = new ToolStripSeparator();
		toolStrip.addMember(toolStripSeparator_5);

		ToolStripSpacer toolStripSpacer = new ToolStripSpacer(110);
		toolStrip.addSpacer(toolStripSpacer);

		TextItem textItem_search = new TextItem("newTextItem_14", "Search");
		toolStrip.addFormItem(textItem_search);
		layout.addMember(toolStrip);
		return layout;
	}

}
