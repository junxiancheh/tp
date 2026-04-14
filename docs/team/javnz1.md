---
layout: page
title: Javier Ng's Project Portfolio Page
---

### Project: TrackMasterPro

TrackMasterPro is a desktop logistics management application designed for sports facility managers in high-density environments like NUS Halls and Residential Colleges.
It utilizes a Command Line Interface (CLI) for high-speed data entry, complemented by a JavaFX GUI.
The application allows managers to track equipment, venues, and personnel within a unified system.
It is written in Java, and has about 5.8 kLoC.

Given below are my contributions to the project.

* **New Feature**: Equipment & Room Management Lifecycle
    * What it does: Developed the core management engine for both equipment inventory and room facilities, supporting add, edit, delete, and list operations.
    * Justification: Centralizing equipment and room tracking into a single CLI tool addresses the fragmentation currently faced by Hall coordinators, who often have to navigate multiple web portals or spreadsheets to verify availability.
    * Highlights: Strict Lockdown Mechanism. I implemented a "State-Machine" logic that prevents any modification or deletion of entities currently in a Booked status. This business rule ensures data integrity by protecting active bookings from accidental administrative overrides.
    * Technical Challenge: Implementing State-Dependent Status Transitions. For example, I programmed the logic to allow Available rooms to move to Maintenance, but strictly blocked Maintenance rooms from being moved to Booked without first being cleared to Available. This required complex validation within the Logic component.
    * Credits: *{mention here if you reused any code/ideas from elsewhere or if a third-party library is heavily used in the feature so that a reader can make a more accurate judgement of how much effort went into the feature}*
    * Credits: *{mention here if you reused any code/ideas from elsewhere or if a third-party library is heavily used in the feature so that a reader can make a more accurate judgement of how much effort went into the feature}*

* **New Feature**: Parameter Validation for CLI
    * What it does: Enhanced the command parser to strictly enforce input constraints. For instance, commands like add-e or edit-r will reject any trailing "noise" or extra arguments (e.g., restrict duplicate prefixes like n/ l/ c/ s/).
    * Justification: In a CLI-based system, maintaining a strict syntax prevents user ambiguity and ensures that accidental keystrokes don't lead to unexpected command behavior.

* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2526-s2.github.io/tp-dashboard/?search=javnz1&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code~other&since=2026-02-20T00%3A00%3A00&filteredFileName=&tabOpen=true&tabType=authorship&tabAuthor=javnz1&tabRepo=AY2526S2-CS2103T-T14-4%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code~other&authorshipIsBinaryFileTypeChecked=false&authorshipIsIgnoredFilesChecked=false)

* **Project management**:
    * Managed the transition from v1.3 to v1.5 by overseeing the synchronization between the Equipment and Room models. 
    * Proactively resolved a project deliverable bottleneck by suggesting possible edge cases to the team and checking of documentations to meet the requirements.

* **Enhancements to existing features**:
    * Updated the GUI Panel list to include an All-in-One panel viewing of Student, Room, and Equipment. (Pull requests [\#173](https://github.com/AY2526S2-CS2103T-T14-4/tp/pull/173))
    * Updated GUI to show colour tagging status of Room and Equipment (Pull requests [\#239](https://github.com/AY2526S2-CS2103T-T14-4/tp/pull/239))
    * Wrote additional tests for existing features to increase coverage (Pull requests [\#89](https://github.com/AY2526S2-CS2103T-T14-4/tp/pull/89), [\#98](https://github.com/AY2526S2-CS2103T-T14-4/tp/pull/98))

* **Documentation**:
    * User Guide:
        * Authored the documentation for the features `add-e`,`list-e`,`delete-e`,`edit-e`,`add-r`,`list-r`,`delete-r`, and `edit-r` (Pull requests [\#114](https://github.com/AY2526S2-CS2103T-T14-4/tp/pull/114), [\#155](https://github.com/AY2526S2-CS2103T-T14-4/tp/pull/155), [\#166](https://github.com/AY2526S2-CS2103T-T14-4/tp/pull/166), [\#256](https://github.com/AY2526S2-CS2103T-T14-4/tp/pull/256), [\#276](https://github.com/AY2526S2-CS2103T-T14-4/tp/pull/276))
        * Did cosmetic tweaks to existing documentation of features `edit-s`, `edit-e`, `edit-r`, and `issue`: [\#166](https://github.com/AY2526S2-CS2103T-T14-4/tp/pull/166)
        * Refined error documentation based on PE-Dry Run feedback, specifically clarifying the distinction between Invalid Command Formats (e.g., non-positive indices) and Invalid Indices (out-of-bounds errors).
        * Updated the Duplicate Handling section to explicitly state that room uniqueness is based on names, providing a clear workaround for rooms with identical names in different locations.
    * Developer Guide:
        * Added implementation details of the `add-e`,`list-e`,`delete-e`,`edit-e`,`add-r`,`list-r`,`delete-r`, and `edit-r` feature.
        * Developed a comprehensive Appendix: Instructions for Manual Testing, covering both standard usage and negative test cases for the "Strict Lockdown" features.

* **Community**:
    * PRs reviewed (with non-trivial review comments): Provided non-trivial review comments on teammate PRs, specifically checking for code logic and code quality standard and ensure logical consistency interaction with other modules.
    * Contributed to forum discussions (examples: [236](https://github.com/NUS-CS2103-AY2526-S2/forum/issues/236), [46](https://github.com/NUS-CS2103-AY2526-S2/forum/issues/46), [307](https://github.com/NUS-CS2103-AY2526-S2/forum/issues/307), [274](https://github.com/NUS-CS2103-AY2526-S2/forum/issues/274))
    * Actively tested another team’s product and reported bugs and suggestions for other teams including functionality flaws and documentation inconsistencies.
