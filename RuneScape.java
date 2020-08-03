package DBMiner;

import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.map.Area;
import org.dreambot.api.methods.skills.Skill;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.wrappers.interactive.GameObject;
import org.dreambot.api.wrappers.interactive.NPC;
import org.dreambot.api.wrappers.widgets.message.Message;

import java.awt.*;

@ScriptManifest(Category = Category.MINING, name = "Dutchy Mining", author = "Dutch", version = 1.0)

public class MiningBot extends AbstractScript {
    private long startTime;
    private int oreMined;

    Area bankArea = new Area(3185, 3444, 3180, 3443, 0);
    Area treeArea = new Area(3176, 3368, 3174, 3366, 0);

    @Override
    public void onStart() {
        startTime = System.currentTimeMillis();
        getSkillTracker().start();
    }

    public final String formatTime(final long ms) {
        long s = ms / 1000, m = s / 60, h = m / 60;
        s %= 60;
        m %= 60;
        h %= 24;
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}