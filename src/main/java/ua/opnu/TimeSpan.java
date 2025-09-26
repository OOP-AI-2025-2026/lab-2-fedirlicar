package ua.opnu;


public class TimeSpan
{
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes)
    {
        if (hours < 0 || minutes < 0 || minutes > 59)
        {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = hours;
            this.minutes = minutes;
        }

    }

    public int getHours()
    {
        return hours;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59)
        {
            return;
        }
        this.minutes += minutes;
        this.hours += hours + this.minutes / 60;
        this.minutes %= 60;
    }

    public void addTimeSpan(TimeSpan timespan) {
        add(timespan.getHours(), timespan.getMinutes());
    }

    public double getTotalHours()
    {
        return hours + minutes / 60.0;
    }

    public int getTotalMinutes()
    {
        return hours * 60 + minutes;
    }

    public void subtract(TimeSpan span)
    {
        int totalThis = getTotalMinutes();
        int totalOther = span.getTotalMinutes();

        if (totalOther > totalThis)
        {
            return;
        }

        int diff = totalThis - totalOther;
        hours = diff / 60;
        minutes = diff % 60;
    }

    public void scale(int factor)
    {
        if (factor <= 0)
        {
            return;
        }
        int total = getTotalMinutes() * factor;
        hours = total / 60;
        minutes = total % 60;
    }
}