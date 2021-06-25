import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class DlgDetailInfo extends TitleAreaDialog {
	
	private Text txtTitle;
	private Text txtAuthor;
	private Text txtPublisher;
	private Text txtCareer;
	private Combo cboBookType;
	private Button rbtnWoman;
	private Button rbtnMan;
	private DateTime dtBirthday;
	
	public String title;
	public String publisher;
	public String bookType;
	public String authorName;
	public String birthDate;
	public Gender gender;
	public String career;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public DlgDetailInfo(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setMessage("\uCC45\uC758 \uC0C1\uC138 \uC815\uBCF4\uC785\uB2C8\uB2E4. \r\n\uC81C\uBAA9\uACFC \uCD9C\uD310\uC0AC\uB97C \uC218\uC815\uD558\uB824\uBA74 \uC0C8\uB85C\uC6B4 \uC815\uBCF4\uB97C \uC785\uB825\uD574\uC8FC\uC138\uC694.");
		setTitle("\uCC45 \uC0C1\uC138 \uC815\uBCF4");
		Composite area = (Composite) super.createDialogArea(parent);
		GridLayout gridLayout = (GridLayout) area.getLayout();
		new Label(area, SWT.NONE);
		
		Composite composite = new Composite(area, SWT.NONE);
		GridData gd_composite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_composite.heightHint = 132;
		gd_composite.widthHint = 488;
		composite.setLayoutData(gd_composite);
		composite.setLayout(new GridLayout(4, false));
		new Label(composite, SWT.NONE);
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setText("\uCC45 \uC81C\uBAA9");
		new Label(composite, SWT.NONE);
		
		txtTitle = new Text(composite, SWT.BORDER);
		txtTitle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		
		Label lblNewLabel_2 = new Label(composite, SWT.NONE);
		lblNewLabel_2.setText("\uCD9C\uD310\uC0AC");
		new Label(composite, SWT.NONE);
		
		txtPublisher = new Text(composite, SWT.BORDER);
		txtPublisher.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		
		Label lblNewLabel_3 = new Label(composite, SWT.NONE);
		lblNewLabel_3.setText("\uC885\uB958");
		new Label(composite, SWT.NONE);
		
		Combo cboBookType = new Combo(composite, SWT.NONE);
		cboBookType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label = new Label(area, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gd_label = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_label.heightHint = 19;
		gd_label.widthHint = 473;
		label.setLayoutData(gd_label);
		new Label(area, SWT.NONE);
		
		Composite composite_1 = new Composite(area, SWT.NONE);
		composite_1.setLayout(new GridLayout(4, false));
		GridData gd_composite_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2);
		gd_composite_1.widthHint = 488;
		composite_1.setLayoutData(gd_composite_1);
		new Label(composite_1, SWT.NONE);
		
		Label lblNewLabel_1 = new Label(composite_1, SWT.NONE);
		lblNewLabel_1.setText("\uC800\uC790");
		new Label(composite_1, SWT.NONE);
		
		txtAuthor = new Text(composite_1, SWT.BORDER);
		txtAuthor.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_1, SWT.NONE);
		
		Label lblNewLabel_4 = new Label(composite_1, SWT.NONE);
		lblNewLabel_4.setText("\uC0DD\uB144\uC6D4\uC77C");
		new Label(composite_1, SWT.NONE);
		
		DateTime dtBirthday = new DateTime(composite_1, SWT.BORDER);
		GridData gd_dtBirthday = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_dtBirthday.widthHint = 342;
		dtBirthday.setLayoutData(gd_dtBirthday);
		new Label(composite_1, SWT.NONE);
		
		Label lblNewLabel_5 = new Label(composite_1, SWT.NONE);
		lblNewLabel_5.setText("\uACBD\uB825");
		new Label(composite_1, SWT.NONE);
		
		txtCareer = new Text(composite_1, SWT.BORDER);
		txtCareer.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_1, SWT.NONE);
		
		Label lblNewLabel_6 = new Label(composite_1, SWT.NONE);
		lblNewLabel_6.setText("\uC131\uBCC4");
		new Label(composite_1, SWT.NONE);
		
		Button rbtnMan = new Button(composite_1, SWT.RADIO);
		rbtnMan.setText("\uB0A8\uC790");
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		
		Button rbtnWoman = new Button(composite_1, SWT.RADIO);
		rbtnWoman.setText("\uC5EC\uC790");
		
		setBookInfo();

		return area;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "Update", true);
		createButton(parent, IDialogConstants.CANCEL_ID, "colse", false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(495, 580);
	}
	
	public void setBookInfo() {
		txtTitle.setText(title);
		txtPublisher.setText(publisher);
		cboBookType.setText(bookType);
		txtAuthor.setText(authorName);
		int y = Integer.parseInt(birthDate.substring(0,4));
		int m = Integer.parseInt(birthDate.substring(5,7).trim());
		int d = Integer.parseInt(birthDate.substring(8).trim());
		dtBirthday.setDate(y, m, d);;
		if(gender == Gender.MAN) rbtnMan.setSelection(true);
		else rbtnWoman.setSelection(true);
	}

}
