# Assignment 1 - Amazing Products
This assignment is built using a single activity, two fragment structure.
- `LoginFragment`
- `ProductListFragment`

## `LoginFragment`
A login screen that only accepts 'admin' for both username and password
respectively. It displays a toast if invalid. The fragment is constructed in the layout directory.
It uses two `EditText` and one `Button` in a `ConstraintLayout`. The inputs are validated in the
`LoginFragment.kt` file. The fragment makes use of the navigation library to navigate to the next
fragment.

## `ProductListFragment`
A fragment that displays a list of items (either equipment or food). It uses the `RecyclerView` to
show the list of items and their name, expiry date (optional), and price. The adapter for the
product list separates styling information and checks for null cases for the given product list.
There is also a `Util` class for the 'static' function to convert the dataset information to 
a list of `Product`. 

# Accessing this Project
The github repo is at https://github.com/evankcook/cs4520-assignment1-starter-code
Feel free to contact cook.ev@northeastern.edu if you have any additional questions!

## Running this Project
Running this project is as simple as hitting the `run` button using your device emulation of choice!
