package ocelot.api.client.gui.component;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;

public class ComponentTextArea extends Component {

	private List<ComponentText> text;

	public ComponentTextArea(int x, int y, int width, int height) {
		super(x, y, width, height);
		text = new ArrayList<ComponentText>();
	}

	public void addText(String string, int color) {
		if (isTextRoom()) {
			String[] tokens = getLinesFromString(string, width);
			for (int i = 0; i < tokens.length; i++) {
				if (this.isTextRoom()) {
					this.text.add(new ComponentText(x, y + text.size() * 9, tokens[i], color));
				}
			}
		}
	}

	public boolean isTextRoom() {
		return text.size() < height;
	}

	@Override
	public void onAddComponent() {
		for (int i = 0; i < text.size(); i++) {
			parent.addComponent(text.get(i));
		}
	}

	protected String[] getLinesFromString(String string, int width) {
		List<String> list = this.fontRenderer.listFormattedStringToWidth(string, width);
		return list.toArray(new String[list.size()]);
	}

	@Override
	public void renderForeground(Minecraft mc, float partialTicks, int mouseX, int mouseY) {
		for (int i = 0; i < text.size(); i++) {
			text.get(i).renderForeground(mc, partialTicks, mouseX, mouseY);
		}
	}
}