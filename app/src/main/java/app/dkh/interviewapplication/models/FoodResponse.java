package app.dkh.interviewapplication.models;

public class FoodResponse {
    private FoodItem[] items;

    public FoodItem[] getItems ()
    {
        return items;
    }

    public void setItems (FoodItem[] items)
    {
        this.items = items;
    }

}
