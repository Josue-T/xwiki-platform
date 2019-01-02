/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.administration.test.po;

import org.openqa.selenium.By;
import org.xwiki.test.ui.po.ConfirmationModal;

/**
 * Represents the actions possible on the delete user confirmation modal.
 * 
 * @version $Id$
 * @since 10.9
 */
public class DeleteUserConfirmationModal extends ConfirmationModal
{
    public DeleteUserConfirmationModal()
    {
        super(By.id("deleteUserModal"));
    }

    @Override
    public void clickOk()
    {
        super.clickOk();
        waitForNotificationSuccessMessage("User deleted");
    }
}
