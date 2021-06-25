package swt.ui;

import java.io.InputStream;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class TitleDlg extends TitleAreaDialog {

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public TitleDlg(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	
	private Image getTitleImage(Class<?> clazz, String path) {
		Image image = null;
		
		try {
			InputStream imageStream = clazz.getResourceAsStream(path);
			Display display = Display.getCurrent();
			ImageData data = new ImageData(imageStream);
			imageStream.close();
			
			if(data.transparentPixel >0 ) {
				image = new Image(display,data,data.getTransparencyMask());
			}
			
			else {
				image = new Image(display,data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return image;
		
	}
	
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		setTitle("MyTitleAreaDialog");
		setMessage("this is a simple TitlereaDialogexample.");
		setTitleImage(getTitleImage(this.getClass(), "mm.png"));
		
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		return area;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}

}
