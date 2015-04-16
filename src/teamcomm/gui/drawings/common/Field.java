package teamcomm.gui.drawings.common;

import com.jogamp.opengl.GL2;
import teamcomm.gui.RoSi2Loader;
import teamcomm.gui.drawings.Static;

/**
 *
 * @author Felix Thielke
 */
public class Field extends Static {

    @Override
    protected void init(GL2 gl) {
        RoSi2Loader.getInstance().cacheModels(gl, new String[]{"field"});
    }

    @Override
    public void draw(final GL2 gl) {
        gl.glCallList(RoSi2Loader.getInstance().loadModel(gl, "field"));
    }

    @Override
    public boolean hasAlpha() {
        return true;
    }

    @Override
    public int getPriority() {
        return 1000;
    }

}
