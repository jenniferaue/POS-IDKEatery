package POS.data;

public class InventoryUpdate
{
    private String foodItem = "";
    private Double numCk;
    private String sqlStatement, sqlStatement2, sqlStatement3, sqlStatement4,
            sqlStatement5, sqlStatement6, sqlStatement7, sqlStatement8,
            sqlStatement9, sqlStatement10;
    private Double currentOnHand, adjustedOnHand, currentOnHand2,
            adjustedOnHand2, currentOnHand3, adjustedOnHand3, currentOnHand4,
            adjustedOnHand4, currentOnHand5, adjustedOnHand5;
    private final Double modConstant = 0.25;

    /**
     * An actionListener that takes the items from the orderList and compares them
     * to the database. It then takes the current amount on hand and subtracts
     * the appropriate amount and updates the onHand amount.
     * @param item              A string that contains the next String within
     *                          the order list and compares it with the items
     *                          within the database.
     */
    public void InventoryUpdate(String item)
    {
        foodItem = item;
        if("Hot Dog".contains(foodItem) || "Hamburger".contains(foodItem))
        {
            //Selects the number of the food item on hand and the
            //corresponding number of buns on hand.
            sqlStatement = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = '" + foodItem + " Bun' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            sqlStatement2 = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = '" + foodItem + "' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            //connects to the database
            String bunItem = EateryDBConnection.getDataString(sqlStatement);
            String entreeItem = EateryDBConnection.getDataString(sqlStatement2);

            currentOnHand = Double.parseDouble(bunItem);
            currentOnHand2 = Double.parseDouble(entreeItem);

            //account for number removed from inventory
            adjustedOnHand = currentOnHand - 1;
            adjustedOnHand2 = currentOnHand2 - 1;

            //Updates database
            sqlStatement3 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand +
                            "WHERE ProductName = '" + foodItem + " Bun' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0.0;

            EateryDBConnection.updateDatabase(sqlStatement3);

            sqlStatement4 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand2 +
                            "WHERE ProductName = '" + foodItem + "' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            EateryDBConnection.updateDatabase(sqlStatement4);
        }

        else if(foodItem.contains("Chicken 2pc") | foodItem.contains("Chicken 4pc") |
                foodItem.contains("Chicken 6pc"))
        {
            //finds number of chicken pieces used
            if(foodItem.contains("2"))
            {
                numCk = 2.0;
            }
            else if(foodItem.contains("4"))
            {
                numCk = 4.0;
            }
            else
            {
                numCk = 6.0;
            }

            //Gets the amount of chicken in inventory
            sqlStatement = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = 'Chicken' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String chkPieces = EateryDBConnection.getDataString(sqlStatement);

            //removes the number of pieces used from inventory
            currentOnHand = Double.parseDouble(chkPieces);
            adjustedOnHand = currentOnHand - numCk;

            //updates inventory
            sqlStatement2 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand +
                            "WHERE ProductName  = 'Chicken' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            EateryDBConnection.updateDatabase(sqlStatement2);
        }

        else if("Chicken Strips".equals(foodItem))
        {
			//gets the number of chicken strips from inventory
            sqlStatement = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = 'Chicken Strips' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String chkStrips = EateryDBConnection.getDataString(sqlStatement);

            // removes the number of chicken strips used from inventory
            currentOnHand = Double.parseDouble(chkStrips);
            adjustedOnHand = currentOnHand - 4;

            //updates inventory
            sqlStatement2 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand +
                            "WHERE ProductName  = 'Chicken Strips' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            EateryDBConnection.updateDatabase(sqlStatement2);
        }

        else if(foodItem.contains("Chicken Sandwich"))
        {
            //gets the amount of chicken on hand from inventory
            sqlStatement = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = 'Chicken' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String chkSandwich = EateryDBConnection.getDataString(sqlStatement);

            // removes the amount of chicken used from inventory
            currentOnHand = Double.parseDouble(chkSandwich);
            adjustedOnHand = currentOnHand - 1;

            //updates inventory
            sqlStatement2 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand +
                            "WHERE ProductName  = 'Chicken' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            EateryDBConnection.updateDatabase(sqlStatement2);
        }
        else if("Fries".equals(foodItem) | "Hushpuppies".equals(foodItem) |
                "Coleslaw".equals(foodItem) | "Mac-n-Cheese".equals(foodItem) |
                "Beans".equals(foodItem) | "Baked Potato".equals(foodItem))
        {
            //gets the amount of pre-portioned sides on hand from inventory
            sqlStatement = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = '" + foodItem + "' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String sideCount = EateryDBConnection.getDataString(sqlStatement);

            // removes the amount of pre-portioned sides used from inventory
            currentOnHand = Double.parseDouble(sideCount);
            adjustedOnHand = currentOnHand - 1;

            //updates inventory
            sqlStatement2 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand +
                            "WHERE ProductName  = '" + foodItem + "' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            EateryDBConnection.updateDatabase(sqlStatement2);

        }

        else if(foodItem.contains("Avocado") | foodItem.contains("Bacon") |
                foodItem.contains("Cheese Slice") | foodItem.contains("Chili") |
                foodItem.contains("Lettuce") | foodItem.contains("Mayo") |
                foodItem.contains("Mixed Cheese") | foodItem.contains("Onions") |
                foodItem.contains("Pickle") | foodItem.contains("Sauerkraut") |
                foodItem.contains("Mushrooms") | foodItem.contains("Tomatoes"))
        {
            //removes modifier from mod item "on side" "add" "side of"
            String modItem = foodItem.trim();

            if(modItem.contains("Add"))
            {
                String modItem2 = modItem.substring(4);

                //gets the amount of pre-portioned extras on hand from inventory
                sqlStatement5 = "SELECT ProductQuantityOnHand " +
                        "FROM Inventory " +
                        "WHERE ProductName = '" + modItem2 + "' " +
                        "AND ProductQuantityOnHand IS NOT NULL";

                String modNum = EateryDBConnection.getDataString(sqlStatement5);

                // removes the amount of pre-portioned extras used from inventory
                currentOnHand = Double.parseDouble(modNum);
                adjustedOnHand = currentOnHand - modConstant;

		//updates inventory
                sqlStatement6 = "UPDATE Inventory " +
                                "SET ProductQuantityOnHand = " + adjustedOnHand +
                                "WHERE ProductName  = '" + modItem2 + "' " +
                                "AND ProductQuantityOnHand IS NOT NULL " +
                                "AND ProductQuantityOnHand > " + 0;

                EateryDBConnection.updateDatabase(sqlStatement6);
            }
            else if(modItem.contains("Side Of"))
            {
                String modItem2 = foodItem.substring(13);

                sqlStatement5 = "SELECT ProductQuantityOnHand " +
                        "FROM Inventory " +
                        "WHERE ProductName = '" + modItem2 + "' " +
                        "AND ProductQuantityOnHand IS NOT NULL";

                String modNum = EateryDBConnection.getDataString(sqlStatement5);

                currentOnHand = Double.parseDouble(modNum);
                adjustedOnHand = currentOnHand - modConstant;


                sqlStatement6 = "UPDATE Inventory " +
                                "SET ProductQuantityOnHand = " + adjustedOnHand +
                                "WHERE ProductName  = '" + modItem2 + "' " +
                                "AND ProductQuantityOnHand IS NOT NULL " +
                                "AND ProductQuantityOnHand > " + 0;

                EateryDBConnection.updateDatabase(sqlStatement6);
            }
            else
            {
                String modItem2 = foodItem.substring(13);

                sqlStatement5 = "SELECT ProductQuantityOnHand " +
                        "FROM Inventory " +
                        "WHERE ProductName = '" + modItem2 + "' " +
                        "AND ProductQuantityOnHand IS NOT NULL";

                String modNum = EateryDBConnection.getDataString(sqlStatement5);

                currentOnHand = Double.parseDouble(modNum);
                adjustedOnHand = currentOnHand - modConstant;


                sqlStatement6 = "UPDATE Inventory " +
                                "SET ProductQuantityOnHand = " + adjustedOnHand +
                                "WHERE ProductName  = '" + modItem2 + "' " +
                                "AND ProductQuantityOnHand IS NOT NULL " +
                                "AND ProductQuantityOnHand > " + 0;

                EateryDBConnection.updateDatabase(sqlStatement6);
            }

        }

        else if(foodItem.contains("Vanilla"))
        {
            //selects the amount of vanilla ice cream on hand
            sqlStatement5 = "SELECT ProductQuantityOnHand " +
                        "FROM Inventory " +
                        "WHERE ProductName = 'Vanilla Ice Cream' " +
                        "AND ProductQuantityOnHand IS NOT NULL";

            String modItem = EateryDBConnection.getDataString(sqlStatement5);

            //removes the amount used
            currentOnHand = Double.parseDouble(modItem);
            adjustedOnHand = currentOnHand - modConstant;

            //updates database
            sqlStatement6 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand +
                            "WHERE ProductName  = 'Vanilla Ice Cream' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            EateryDBConnection.updateDatabase(sqlStatement6);

            if(foodItem.contains("Cone"))
            {
                //gets the amount of cones on hand
                sqlStatement5 = "SELECT ProductQuantityOnHand " +
                        "FROM Inventory " +
                        "WHERE ProductName = 'Ice Cream Cones' " +
                        "AND ProductQuantityOnHand IS NOT NULL";

                String coneNum = EateryDBConnection.getDataString(sqlStatement5);

		//removes the amount used
                currentOnHand = Double.parseDouble(coneNum);
                adjustedOnHand = currentOnHand - 1;

		//updates the database
                sqlStatement6 = "UPDATE Inventory " +
                                "SET ProductQuantityOnHand = " + adjustedOnHand +
                                "WHERE ProductID  = 'Ice Cream Cones' " +
                                "AND ProductQuantityOnHand IS NOT NULL " +
                                "AND ProductQuantityOnHand > " + 0;

                EateryDBConnection.updateDatabase(sqlStatement6);
            }
        }

        else if(foodItem.contains("Strawberry"))
        {
            //selects the amount of strawberry ice cream on hand
            sqlStatement5 = "SELECT ProductQuantityOnHand " +
                        "FROM Inventory " +
                        "WHERE ProductName = 'Strawberry Ice Cream' " +
                        "AND ProductQuantityOnHand IS NOT NULL";

            String modItem = EateryDBConnection.getDataString(sqlStatement5);

            //removes the amount used
            currentOnHand = Double.parseDouble(modItem);
            adjustedOnHand = currentOnHand - modConstant;

            //updates database
            sqlStatement6 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand +
                            "WHERE ProductName  = 'Strawberry Ice Cream' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            EateryDBConnection.updateDatabase(sqlStatement6);

            if(foodItem.contains("Cone"))
            {
		//selects the amount of cones on hand
                sqlStatement5 = "SELECT ProductQuantityOnHand " +
                                "FROM Inventory " +
                                "WHERE ProductName = 'Ice Cream Cones' " +
                                "AND ProductQuantityOnHand IS NOT NULL";

                String coneNum = EateryDBConnection.getDataString(sqlStatement5);

		//removes the amount used
                currentOnHand = Double.parseDouble(coneNum);
                adjustedOnHand = currentOnHand - 1;

		//updates database
                sqlStatement6 = "UPDATE Inventory " +
                                "SET ProductQuantityOnHand = " + adjustedOnHand +
                                "WHERE ProductID  = 'Ice Cream Cones' " +
                                "AND ProductQuantityOnHand IS NOT NULL " +
                                "AND ProductQuantityOnHand > " + 0;

                EateryDBConnection.updateDatabase(sqlStatement6);
            }
        }

        else if(foodItem.contains("Chocolate"))
        {
            //selects the amount of strawberry ice cream on hand
            sqlStatement5 = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = 'Chocolate Ice Cream' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String modItem = EateryDBConnection.getDataString(sqlStatement5);

            //removes the amount used
            currentOnHand = Double.parseDouble(modItem);
            adjustedOnHand = currentOnHand - modConstant;

            //updates the database
            sqlStatement6 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand +
                            "WHERE ProductName  = 'Chocolate Ice Cream' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            EateryDBConnection.updateDatabase(sqlStatement6);

            if(foodItem.contains("Cone"))
            {
		//selects the amount of cones on hand
                sqlStatement5 = "SELECT ProductQuantityOnHand " +
                                "FROM Inventory " +
                                "WHERE ProductName = 'Ice Cream Cones' " +
                                "AND ProductQuantityOnHand IS NOT NULL";

                String coneNum = EateryDBConnection.getDataString(sqlStatement5);

		//removes the amount used
                currentOnHand = Double.parseDouble(coneNum);
                adjustedOnHand = currentOnHand - 1;

		//updates the inventory
                sqlStatement6 = "UPDATE Inventory " +
                                "SET ProductQuantityOnHand = " + adjustedOnHand +
                                "WHERE ProductID  = 'Ice Cream Cones' " +
                                "AND ProductQuantityOnHand IS NOT NULL " +
                                "AND ProductQuantityOnHand > " + 0;

                EateryDBConnection.updateDatabase(sqlStatement6);
            }
        }

        else if(foodItem.contains("Small"))
        {
            //gets the name of the drink used
            String drinkName = foodItem.substring(18);

            //selects the amount of that particular drink on hand and number of cups
            sqlStatement = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = '16 oz. Cups' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            sqlStatement2 = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = '" + drinkName + "' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String drinkSize = EateryDBConnection.getDataString(sqlStatement);
            String drinkItem = EateryDBConnection.getDataString(sqlStatement2);

            //removes the amounts used
            currentOnHand = Double.parseDouble(drinkSize);
            currentOnHand2 = Double.parseDouble(drinkItem);

            adjustedOnHand = currentOnHand - 1;
            adjustedOnHand2 = currentOnHand2 - 0.01;

            //updates the inventory
            sqlStatement3 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand +
                            "WHERE ProductName  = '16 oz. Cups' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            sqlStatement4 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand2 +
                            "WHERE ProductName  = '" + drinkName + "' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            EateryDBConnection.updateDatabase(sqlStatement3);
            EateryDBConnection.updateDatabase(sqlStatement4);
        }

        else if(foodItem.contains("Medium"))
        {
            //gets the name of the drink used
            String drinkName = foodItem.substring(19);

            //selects the amount of that particular drink on hand and number of cups
            sqlStatement = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = '20 oz. Cups' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            sqlStatement2 = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = '" + drinkName + "' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String drinkSize = EateryDBConnection.getDataString(sqlStatement);
            String drinkItem = EateryDBConnection.getDataString(sqlStatement2);

            //removes the amounts used
            currentOnHand = Double.parseDouble(drinkSize);
            currentOnHand2 = Double.parseDouble(drinkItem);

            adjustedOnHand = currentOnHand - 1;
            adjustedOnHand2 = currentOnHand2 - 0.02;

            //updates the database
            sqlStatement3 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand +
                            "WHERE ProductName  = '20 oz. Cups' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            sqlStatement4 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand2 +
                            "WHERE ProductName  = '" + drinkName + "' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            EateryDBConnection.updateDatabase(sqlStatement3);
            EateryDBConnection.updateDatabase(sqlStatement4);
        }

        else if(foodItem.contains("Large"))
        {
            //gets the name of the drink used
            String drinkName = foodItem.substring(18);

            //selects the amount of that particular drink on hand and number of cups
            sqlStatement = "SELECT ProductQuantityOnHand " +
                        "FROM Inventory " +
                        "WHERE ProductName = '22 oz. Cups' " +
                        "AND ProductQuantityOnHand IS NOT NULL";

            sqlStatement2 = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = '" + drinkName + "' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String drinkSize = EateryDBConnection.getDataString(sqlStatement);
            String drinkItem = EateryDBConnection.getDataString(sqlStatement2);

            //removes the amounts used
            currentOnHand = Double.parseDouble(drinkSize);
            currentOnHand2 = Double.parseDouble(drinkItem);

            adjustedOnHand = currentOnHand - 1;
            adjustedOnHand2 = currentOnHand2 - 0.03;

            //updates the database
            sqlStatement3 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand +
                            "WHERE ProductName  = '22 oz. Cups' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            sqlStatement4 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand2 +
                            "WHERE ProductName  = '" + drinkName + "' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            EateryDBConnection.updateDatabase(sqlStatement3);
            EateryDBConnection.updateDatabase(sqlStatement4);
        }

        else if(foodItem.contains("Banana"))
        {
            //Gets the number of items on hand that are required for a banana split.
            //This includes all three types of ice cream, chocolate topping, and bananas.
            sqlStatement = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = 'Vanilla Ice Cream' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String vanIceCream = EateryDBConnection.getDataString(sqlStatement);

            sqlStatement2 = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = 'Chocolate Ice Cream' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String chocoIceCream = EateryDBConnection.getDataString(sqlStatement2);

            sqlStatement3 = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = 'Strawberry Ice Cream' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String strawIceCream = EateryDBConnection.getDataString(sqlStatement3);

            sqlStatement4 = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = 'Bananas' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String bananaNum = EateryDBConnection.getDataString(sqlStatement4);

            sqlStatement5 = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = 'Chocolate Topping' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String chocoTopping = EateryDBConnection.getDataString(sqlStatement5);

            //removes the amount used.
            currentOnHand = Double.parseDouble(vanIceCream);
            currentOnHand2 = Double.parseDouble(chocoIceCream);
            currentOnHand3 = Double.parseDouble(strawIceCream);
            currentOnHand4 = Double.parseDouble(bananaNum);
            currentOnHand5 = Double.parseDouble(chocoTopping);

            adjustedOnHand = currentOnHand - modConstant;
            adjustedOnHand2 = currentOnHand2 - modConstant;
            adjustedOnHand3 = currentOnHand3 - modConstant;
            adjustedOnHand4 = currentOnHand4 - 1;
            adjustedOnHand5 = currentOnHand5 - modConstant;

            //updates the database
            sqlStatement6 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand +
                            "WHERE ProductName  = 'Vanilla Ice Cream' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            sqlStatement7 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand2 +
                            "WHERE ProductName  = 'Chocolate Ice Cream' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            sqlStatement8 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand3 +
                            "WHERE ProductName  = 'Strawberry Ice Cream' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            sqlStatement9 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand4 +
                            "WHERE ProductName  = 'Bananas' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            sqlStatement10 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand5 +
                            "WHERE ProductName  = 'Chocolate Topping' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            EateryDBConnection.updateDatabase(sqlStatement6);
            EateryDBConnection.updateDatabase(sqlStatement7);
            EateryDBConnection.updateDatabase(sqlStatement8);
            EateryDBConnection.updateDatabase(sqlStatement9);
            EateryDBConnection.updateDatabase(sqlStatement10);
        }

        else if(foodItem.contains("Bottled Water"))
        {
            //selects the number of bottled waters on hand
            sqlStatement = "SELECT ProductQuantityOnHand " +
                            "FROM Inventory " +
                            "WHERE ProductName = 'Bottled Water' " +
                            "AND ProductQuantityOnHand IS NOT NULL";

            String bottledCount = EateryDBConnection.getDataString(sqlStatement);

            //removes the amount used
            currentOnHand = Double.parseDouble(bottledCount);
            adjustedOnHand = currentOnHand - 1;

            //updates the database
            sqlStatement2 = "UPDATE Inventory " +
                            "SET ProductQuantityOnHand = " + adjustedOnHand + " " +
                            "WHERE ProductName = 'Bottled Water' " +
                            "AND ProductQuantityOnHand IS NOT NULL " +
                            "AND ProductQuantityOnHand > " + 0;

            EateryDBConnection.updateDatabase(sqlStatement2);
        }
    }
}
