package controllers;

import com.toedter.calendar.JDateChooser;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class BirthDateValidator {

    private JDateChooser dateChooser;

    public BirthDateValidator(JDateChooser dateChooser) {
        this.dateChooser = dateChooser;

        this.dateChooser.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    Date selectedDate = (Date) evt.getNewValue();
                    if (selectedDate != null) {
                        if (isFutureDate(selectedDate)) {
                            JOptionPane.showMessageDialog(null, "Fecha no permitida. No puede seleccionar una fecha futura.");
                            dateChooser.setDate(null); // Resetear la fecha a null si no es válida
                        }
                    }
                }
            }
        });
    }

    private boolean isFutureDate(Date date) {
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);
        today.set(Calendar.MILLISECOND, 0);
        return date.after(today.getTime());
    }
}
