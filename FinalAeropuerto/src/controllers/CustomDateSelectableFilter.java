package controllers;

import com.toedter.calendar.JDateChooser;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class CustomDateSelectableFilter {

    private JDateChooser dateChooser;
    private String dia1;
    private String dia2;

    public CustomDateSelectableFilter(JDateChooser dateChooser, String dia1, String dia2) {
        this.dateChooser = dateChooser;
        this.dia1 = dia1;
        this.dia2 = dia2;

        // Añadir el PropertyChangeListener para manejar los cambios de fecha
        this.dateChooser.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    Date selectedDate = (Date) evt.getNewValue();
                    if (selectedDate != null) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(selectedDate);
                        if (!isAllowedDay(calendar) || isPastDate(selectedDate)) {
                            JOptionPane.showMessageDialog(null, "Fecha no permitida. Seleccione una fecha válida.");
                            dateChooser.setDate(null); // Resetear la fecha a null si no es válida
                        }
                    }
                }
            }
        });
    }

    private boolean isAllowedDay(Calendar calendar) {
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int dia1Int = getDayOfWeek(dia1);
        int dia2Int = getDayOfWeek(dia2);
        return dayOfWeek == dia1Int || dayOfWeek == dia2Int;
    }

    private int getDayOfWeek(String dia) {
        switch (dia) {
            case "Lunes":
                return Calendar.MONDAY;
            case "Martes":
                return Calendar.TUESDAY;
            case "Miércoles":
                return Calendar.WEDNESDAY;
            case "Jueves":
                return Calendar.THURSDAY;
            case "Viernes":
                return Calendar.FRIDAY;
            case "Sábado":
                return Calendar.SATURDAY;
            case "Domingo":
                return Calendar.SUNDAY;
            default:
                return -1;
        }
    }

    private boolean isPastDate(Date date) {
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);
        today.set(Calendar.MILLISECOND, 0);
        return date.before(today.getTime());
    }
}
