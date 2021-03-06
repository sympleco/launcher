package com.sympleco.common.client;

import com.google.gwt.core.client.EntryPoint;
import com.smartgwt.client.widgets.menu.events.ClickHandler;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Command;
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
public class main {
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void openNewWindow(String name, String url) {
	    com.google.gwt.user.client.Window.open(url, name.replace(" ", "_"),
	           "menubar=no," + 
	           "location=false," + 
	           "resizable=yes," + 
	           "scrollbars=yes," + 
	           "status=no," + 
	           "dependent=true");
	}
	Canvas mainPanel() {
		Command command = new Command()
		{
		    public void execute()
		    {
		    	main.openNewWindow("SYMPLECO MAIL LOGIN", "https://mail.google.com/a/sympleco.com");
		    }
		};
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

//		ToolStripButton toolStripButton_about = new ToolStripButton("About");
////		toolStripButton_about.setWidth("");
//		toolStrip.addButton(toolStripButton_about);
//
//		ToolStripSeparator toolStripSeparator = new ToolStripSeparator();
//		toolStrip.addMember(toolStripSeparator);
//
//		ToolStripButton toolStripButton_product = new ToolStripButton("Product");
////		toolStripButton_product.setWidth("");
//		toolStrip.addButton(toolStripButton_product);
//
//		ToolStripSeparator toolStripSeparator_1 = new ToolStripSeparator();
//		toolStrip.addMember(toolStripSeparator_1);

//		ToolStripButton toolStripButton_partner = new ToolStripButton("Partner");
//		toolStrip.addButton(toolStripButton_partner);
//
//		ToolStripSeparator toolStripSeparator_3 = new ToolStripSeparator();
//		toolStrip.addMember(toolStripSeparator_3);
//
//		ToolStripButton toolStripButton_pricing = new ToolStripButton("Pricing");
//		toolStrip.addButton(toolStripButton_pricing);
//
//		ToolStripSeparator toolStripSeparator_4 = new ToolStripSeparator();
//		toolStrip.addMember(toolStripSeparator_4);

		ToolStripButton toolStripButton_signup = new ToolStripButton("Contact Us");
		toolStripButton_signup.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler() {
			@Override
			public void onClick(
					com.smartgwt.client.widgets.events.ClickEvent event) {
                com.google.gwt.user.client.Window.open("mailto:sales@sympleco.com?subject=Sympleco,Please%20Contact%20Me&body=Contact%20me%20within%203%20days%20for%20services", "Request For Services", null);
				
			}
        });

		toolStrip.addButton(toolStripButton_signup);

		ToolStripSeparator toolStripSeparator_2 = new ToolStripSeparator();
		toolStrip.addMember(toolStripSeparator_2);

		ToolStripButton toolStripButton = new ToolStripButton("Sign In To Mail");
		
		toolStripButton.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler() {
			@Override
			public void onClick(
					com.smartgwt.client.widgets.events.ClickEvent event) {
                com.google.gwt.user.client.Window.open("https://mail.google.com/a/sympleco.com", "Sympleco Mail", null);
				
			}
        });
		toolStrip.addButton(toolStripButton);

		ToolStripSeparator toolStripSeparator_5 = new ToolStripSeparator();
		toolStrip.addMember(toolStripSeparator_5);

		ToolStripSpacer toolStripSpacer = new ToolStripSpacer(110);
		toolStrip.addSpacer(toolStripSpacer);

		TextItem textItem_search = new TextItem("newTextItem_14", "Search");
		toolStrip.addFormItem(textItem_search);
		layout.addMember(toolStrip);

		String imgurl = "hometopbackground.jpg";
//		imgurl = "http://www.gooddata.com/files/2010/11/hometopbackground.png";
//		imgurl = "com/sympleco/common/client/hometopbackground.jpg";
		imgurl = GWT.getHostPageBaseURL()+"hometopbackground.png";
//		Window.alert(imgurl);

		HLayout hLayout_1 = new HLayout();
		hLayout_1.setHeight("351px");
		final Image img = new Image();
//		img.setSize("100%", "100%");
//		img.setAutoFit(true);
		hLayout_1.addMember(img);
		img.setSize("882px", "421px");
		hLayout_1.setAutoWidth();
		layout.addMember(hLayout_1);
		
		img.setUrl(imgurl);
		
//		HLayout hLayout_3 = new HLayout();
//		hLayout_3.setWidth("882px");
//
//		HTMLFlow flwsaasAndCloud = new HTMLFlow("<strong>Solution Providers:</strong><br> \nThrill your customers with embedded dashboards and flexible reporting<br> \n<div style=\"color:#ffffff; padding-top:8px\"><a href=\".\">Get Powered by Sympleco \u00BB</a></div> \n ");
//		flwsaasAndCloud.setSize("30%", "78px");
//		flwsaasAndCloud.setAllowCaching(true);
//		hLayout_3.addMember(flwsaasAndCloud);
//
//		HTMLFlow flwbiAndIt = new HTMLFlow("<strong>IT Developers:</strong><br> \nCheck out our complete Platform as a Service and open REST APIs<br> \n<div style=\"color:#ffffff; padding-top:8px\"><a href=\".\">Learn About our Platform \u00BB</a>");
//		flwbiAndIt.setSize("30%", "78px");
//		hLayout_3.addMember(flwbiAndIt);
//
//		HTMLFlow flwbusinessUsersVisualize = new HTMLFlow("<strong>Business Users: </strong><br> \nVisualize the data that drives your business and drill down for deep insight<br> \n<div style=\"color:#ffffff; padding-top:8px\"><a href=\".\">See Sympleco in Action \u00BB</a>");
//		flwbusinessUsersVisualize.setSize("30%", "78px");
//		hLayout_3.addMember(flwbusinessUsersVisualize);
//		layout.addMember(hLayout_3);
//		
//		HLayout hLayout_4 = new HLayout();
//		hLayout_4.setSize("886px", "16px");
//		
//		HTMLFlow flwprogramManagementSolutions = new HTMLFlow("<bold>Program Management Solutions</bold>\n");
//		flwprogramManagementSolutions.setWidth("30%");
//		hLayout_4.addMember(flwprogramManagementSolutions);
//		
//		HTMLFlow flwipadAndIphone = new HTMLFlow("<bold>iPad and iPhone Solutions</bold>");
//		flwipadAndIphone.setWidth("30%");
//		hLayout_4.addMember(flwipadAndIphone);
//		
//		HTMLFlow flwBusinessProcessDevelopment = new HTMLFlow("Business Process Auomation");
//		flwBusinessProcessDevelopment.setWidth("30%");
//		hLayout_4.addMember(flwBusinessProcessDevelopment);
//		layout.addMember(hLayout_4);
		return layout;
	}

}
