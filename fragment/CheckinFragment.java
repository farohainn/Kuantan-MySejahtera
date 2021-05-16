/*public class ProfileActivity extends AppCompatActivity {

    private static final int CHOOSE_IMAGE = 101;

    TextView textView;
    EditText name,date,time;


    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_checkin);
        mAuth = FirebaseAuth.getInstance();



        name = (EditText) findViewById(R.id.name);
        date = (EditText) findViewById(R.id.date);
        time = (EditText) findViewById(R.id.time);
        textView = (TextView) findViewById(R.id.textViewVerified);


        loadUserInformation();

        findViewById(R.id.buttonSave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveUserInformation();
                Toast.makeText(ProfileActivity.this, "Successfull save", Toast.LENGTH_SHORT).show();
                Intent in =new Intent(ProfileActivity.this, Dashboard.class);
                startActivity(in);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        if (mAuth.getCurrentUser() == null) {
            finish();
            startActivity(new Intent(this, MainActivity.class));
        }
    }

    private void loadUserInformation() {
        final FirebaseUser user = mAuth.getCurrentUser();

        if (user != null) {
            if (user.getDisplayName() != null) {
                name.setText(user.getDisplayName());
            }

            if (user.getDisplayName() != null) {
                time.setText(user.getDisplayName());
            }
            if (user.getDisplayName() != null) {
                date.setText(user.getDisplayName());
            }

            if (user.isEmailVerified()) {
                textView.setText("Email Verified");
            } else {
                textView.setText("Email Not Verified (Click to Verify)");
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        user.sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(ProfileActivity.this, "Verification Email Sent", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });
            }
        }
    }


    private void saveUserInformation() {


        String displayName = name.getText().toString();
        String displayTime = time.getText().toString();
        String displayDate = date.getText().toString();

        if (displayName.isEmpty()) {
            name.setError("Name required");
            name.requestFocus();
            return;
        }
        if (displayTime.isEmpty()) {
            time.setError("Time required");
            time.requestFocus();
            return;
        }
        if (displayDate.isEmpty()) {
            date.setError("Date required");
            date.requestFocus();
            return;
        }




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


    }*/



    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuLogout:

                FirebaseAuth.getInstance().signOut();
                finish();
                startActivity(new Intent(this, MainActivity.class));

                break;
        }

        return true;
    }

    private void showImageChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Profile Image"), CHOOSE_IMAGE);
    }*/