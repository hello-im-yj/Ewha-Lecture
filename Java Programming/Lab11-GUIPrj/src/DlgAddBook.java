import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import java.awt.Frame;
import org.eclipse.swt.awt.SWT_AWT;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JRootPane;
import org.eclipse.swt.layout.GridLayout;
import java.awt.GridBagLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.ColumnLayout;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Button;

public class DlgAddBook extends TitleAreaDialog {
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txtTitle;
	private Text txtPublisher;
	private Text txtAuthor;
	private Text txtCareer;
	private Combo cboBookType;
	private Button rbtnWoman;
	private Button rbtnMan;
	private DateTime dtBirthday;
	
	//책의 정보를 담을 필드 선언
	public String title;
	public String publisher;
	public String bookType;
	public String authorName;
	public String career;
	public String birthDate;
	public Gender gender;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public DlgAddBook(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setMessage("\uCC45 \uC815\uBCF4\uC640 \uC800\uC790 \uC815\uBCF4\uB97C \uC785\uB825\uD558\uC138\uC694. ");
		setTitle("\uCC45 \uCD94\uAC00");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new GridLayout(4, false));
		GridData gd_composite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_composite.heightHint = 124;
		gd_composite.widthHint = 434;
		composite.setLayoutData(gd_composite);
		formToolkit.adapt(composite);
		formToolkit.paintBordersFor(composite);
		new Label(composite, SWT.NONE);
		
		Label lblNewLabel_1 = new Label(composite, SWT.NONE);
		formToolkit.adapt(lblNewLabel_1, true, true);
		lblNewLabel_1.setText("\uCC45 \uC81C\uBAA9");
		new Label(composite, SWT.NONE);
		
		txtTitle = new Text(composite, SWT.BORDER);
		txtTitle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(txtTitle, true, true);
		new Label(composite, SWT.NONE);
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		formToolkit.adapt(lblNewLabel, true, true);
		lblNewLabel.setText("\uCD9C\uD310\uC0AC");
		new Label(composite, SWT.NONE);
		
		txtPublisher = new Text(composite, SWT.BORDER);
		txtPublisher.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(txtPublisher, true, true);
		new Label(composite, SWT.NONE);
		
		Label lblNewLabel_2 = new Label(composite, SWT.NONE);
		formToolkit.adapt(lblNewLabel_2, true, true);
		lblNewLabel_2.setText("\uC885\uB958");
		new Label(composite, SWT.NONE);
		
		Combo cboBookType = new Combo(composite, SWT.NONE);
		cboBookType.setItems(new String[] {"\uC18C\uC124", "\uC790\uAE30\uACC4\uBC1C", "\uC2DC"});
		cboBookType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(cboBookType);
		formToolkit.paintBordersFor(cboBookType);
		cboBookType.select(0);
		
		Label label = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gd_label = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_label.widthHint = 434;
		label.setLayoutData(gd_label);
		formToolkit.adapt(label, true, true);
		new Label(container, SWT.NONE);
		
		Composite composite_1 = new Composite(container, SWT.NONE);
		composite_1.setLayout(new GridLayout(4, false));
		GridData gd_composite_1 = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_composite_1.heightHint = 197;
		gd_composite_1.widthHint = 434;
		composite_1.setLayoutData(gd_composite_1);
		formToolkit.adapt(composite_1);
		formToolkit.paintBordersFor(composite_1);
		new Label(composite_1, SWT.NONE);
		
		Label lblNewLabel_3 = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblNewLabel_3, true, true);
		lblNewLabel_3.setText("\uC800\uC790");
		new Label(composite_1, SWT.NONE);
		
		txtAuthor = new Text(composite_1, SWT.BORDER);
		txtAuthor.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(txtAuthor, true, true);
		new Label(composite_1, SWT.NONE);
		
		Label lblNewLabel_4 = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblNewLabel_4, true, true);
		lblNewLabel_4.setText("\uC0DD\uB144\uC6D4\uC77C");
		new Label(composite_1, SWT.NONE);
		
		DateTime dtBirthday = new DateTime(composite_1, SWT.BORDER);
		GridData gd_dtBirthday = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_dtBirthday.widthHint = 289;
		dtBirthday.setLayoutData(gd_dtBirthday);
		formToolkit.adapt(dtBirthday);
		formToolkit.paintBordersFor(dtBirthday);
		new Label(composite_1, SWT.NONE);
		
		Label lblNewLabel_5 = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblNewLabel_5, true, true);
		lblNewLabel_5.setText("\uACBD\uB825");
		new Label(composite_1, SWT.NONE);
		
		txtCareer = new Text(composite_1, SWT.BORDER);
		txtCareer.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(txtCareer, true, true);
		new Label(composite_1, SWT.NONE);
		
		Label lblNewLabel_6 = new Label(composite_1, SWT.NONE);
		formToolkit.adapt(lblNewLabel_6, true, true);
		lblNewLabel_6.setText("\uC131\uBCC4");
		new Label(composite_1, SWT.NONE);
		
		Button rbtnMan = new Button(composite_1, SWT.RADIO);
		formToolkit.adapt(rbtnMan, true, true);
		rbtnMan.setText("\uB0A8\uC790");
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		
		Button rbtnWoman = new Button(composite_1, SWT.RADIO);
		formToolkit.adapt(rbtnWoman, true, true);
		rbtnWoman.setText("\uC5EC\uC790");

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

	@Override
	protected void okPressed() {
		// TODO Auto-generated method stub
		title = txtTitle.getText();
		publisher = txtPublisher.getText();
		bookType = cboBookType.getText();
		authorName = txtAuthor.getText();
		career = txtCareer.getText();
		birthDate = String.format("%4d-%2d-%2d", dtBirthday.getYear(),dtBirthday.getMonth(),dtBirthday.getDay());
		if(rbtnMan.getSelection() == true) gender = Gender.MAN;
		else gender = Gender.WOMAN;
		
		super.okPressed();
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 585);
	}
}
