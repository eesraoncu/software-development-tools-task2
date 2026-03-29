# Software Development Tools - Homework 2
**Bialystok University of Technology - Software Engineering**

This repository contains the practical assignments for the Git and Version Control Systems homework. Below are the step-by-step executions, screenshots, and brief explanations of the tasks performed using both the terminal (PowerShell) and the IDE (IntelliJ IDEA).

---

### Step A: Create Remote Repository
I created an empty remote repository named `software-development-tools-task2` on GitHub.
![Step A - Remote Repo](images/Ekran%20görüntüsü%202026-03-29%20154224.png)

### Step B: Clone the Empty Repository
I cloned the empty repository to my local machine using the `git clone` command via PowerShell.
![Step B - Git Clone 1](images/Ekran%20görüntüsü%202026-03-29%20154310.png)
![Step B - Git Clone 2](images/Ekran%20görüntüsü%202026-03-29%20154323.png)

### Step C: Create an Empty Project in the Local Repo Folder
I opened the cloned folder in IntelliJ IDEA and initialized a new empty Java project within this directory.
![Step C - Create Project 1](images/Ekran%20görüntüsü%202026-03-29%20154711.png)
![Step C - Create Project 2](images/Ekran%20görüntüsü%202026-03-29%20154759.png)

### Steps D, E, F: First Commit (Project Skeleton)
I added the initial project files and a simple Java skeleton, then committed the whole project to the local repository.
![Steps D-F - First Commit](images/Ekran%20görüntüsü%202026-03-29%20155010.png)

### Steps G, H: Add More Code and Commit
I added the initial version of the Student Management application with basic logic, added the files (`git add .`), and committed the changes.
![Steps G-H - Second Commit](images/Ekran%20görüntüsü%202026-03-29%20155750.png)

### Steps I, J: Add More Features and Commit
I implemented additional features (student deletion and top student calculation logic), and committed these final code improvements.
![Steps I-J - Third Commit](images/Ekran%20görüntüsü%202026-03-29%20160159.png)

### Step K: Look at Code History
I used the `git log` command to view the entire commit history and the specific commit hashes of the project.
![Step K - Git Log](images/Ekran%20görüntüsü%202026-03-29%20160240.png)

### Step L: Look at Code Annotations
I used the `git blame Main.java` command to see the revision history line-by-line, showing who authored each line and in which commit.
![Step L - Git Blame](images/Ekran%20görüntüsü%202026-03-29%20160800.png)

### Step M: Checkout Different Revisions
I used the `git checkout <commit_hash>` command to travel back to a previous revision (`67fa195`). The terminal successfully showed the "detached HEAD" state.
![Step M - Git Checkout](images/Ekran%20görüntüsü%202026-03-29%20161136.png)
![Step M - Return to Main](images/Ekran%20görüntüsü%202026-03-29%20161233.png)

---
### Steps N, O: Add Changes Without Commit & Revert
I made a modification to `Main.java` but did not commit it. I verified the uncommitted change with `git status`. Since the changes were not committed, `git revert` is not the correct command here. Instead, I used `git restore Main.java` to discard the changes in the working directory and bring the file back to its previous state.
![Steps N-O - Restore Uncommitted Changes 1](images/Ekran%20görüntüsü%202026-03-29%20162025.png)
![Steps N-O - Restore Uncommitted Changes 2](images/Ekran%20görüntüsü%202026-03-29%20162244.png)

### Steps P, R: Push to Remote & Delete Local Repo
I pushed the finalized main branch to the remote GitHub repository. After confirming the code was safe online, I used PowerShell's `Remove-Item -Recurse -Force` command to completely delete the local project folder and the hidden `.git` directory.
![Step P - Push](images/Ekran%20görüntüsü%202026-03-29%20162348.png)
![Step R - Delete Local Repo](images/Ekran%20görüntüsü%202026-03-29%20162723.png)

### Step S: Clone the Project Again
I successfully cloned the repository back from GitHub to my local machine.
![Step S - Clone Again](images/Ekran%20görüntüsü%202026-03-29%20162723.png)

### Step T: Create Tag and Checkout Branches
I attempted to create a tag named `v1.0` (it already existed from a previous test). Then, I created and switched to a new branch named `test` using `git checkout -b test`.
![Step T - Tag and Branch](images/Ekran%20görüntüsü%202026-03-29%20163505.png)

### Steps W, X, Y: Improve Code in Branch & Merge
While on the `test` branch, I improved the code (added a sorting feature) and committed it. Then, I switched back to the `main` branch (`git checkout main`) and successfully merged the `test` branch into `main` (`git merge test`).
![Steps W-Y - Branch and Merge](images/Ekran%20görüntüsü%202026-03-29%20163726.png)

### Step Z: Add Collaborator
I navigated to my GitHub repository settings and added my friend (Mustafa Bosnalı) as a collaborator to grant them write access.
![Step Z - Add Collaborator](images/Ekran%20görüntüsü%202026-03-29%20165714.png)

### Step Z1: Produce Conflict
To simulate a real-world merge conflict:
1.  My friend changed a specific line in `Main.java` and pushed it to the remote repository.
2.  I modified the exact same line differently in my local IDE.
3.  I committed my change ("turkce mesaj eklendi") and tried to `git push`, which was rejected by the remote.
4.  I ran `git pull`, which resulted in a `CONFLICT (content): Merge conflict in...` error as Git could not automatically resolve the differences.
![Step Z1 - Modify Code & Push Rejected](images/Ekran%20görüntüsü%202026-03-29%20172039.png)
![Step Z1 - Conflict Error](images/Ekran%20görüntüsü%202026-03-29%20172103.png)

---
### Step Z2: Solve the Conflict and Push to Remote
I opened the conflicting file (`Main.java`) in my IDE to resolve the issue. Git marked the conflicting areas with `<<<<<<< HEAD`, `=======`, and `>>>>>>>`. 
![Step Z2 - Conflict in IDE](images/Ekran%20görüntüsü%202026-03-29%20172111.png)

I manually resolved the conflict by removing the Git markers and choosing the final version of the code ("have a nice day!").
![Step Z2 - Resolved in IDE](images/Ekran%20görüntüsü%202026-03-29%20172448.png)

After saving the resolved file, I staged the changes (`git add .`), committed the merge resolution (`git commit -m "the conflict has been resolved"`), and successfully pushed the final solution to the remote repository.
![Step Z2 - Push Resolved Conflict](images/Ekran%20görüntüsü%202026-03-29%20172626.png)